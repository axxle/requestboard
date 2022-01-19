package ru.axxle.requestboard.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import ru.axxle.requestboard.dao.InstanceRequestDao;
import ru.axxle.requestboard.model.InstanceRequest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class InstanceRequestDaoImpl implements InstanceRequestDao {

    private static final String INSERT_QUERY = "insert into INSTANCE_REQUEST (instanceId, threadName, startTime, endTime) values (?, ?, ?, ?)";
    private static final String SELECT_ALL_ORDER_DESC_QUERY = "select id, instanceId, threadName, startTime, endTime from INSTANCE_REQUEST order by id desc";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(InstanceRequest instanceRequest) {
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        jdbcTemplate.update(INSERT_QUERY, instanceRequest.getInstanceId(), instanceRequest.getThreadName(), startTime, endTime);
    }

    @Override
    public InstanceRequest[] getAllOrderDesc() {
        List<InstanceRequest> result = jdbcTemplate.query(SELECT_ALL_ORDER_DESC_QUERY, new RowMapper<InstanceRequest>() {
            @Override
            public InstanceRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
                InstanceRequest instanceRequest = new InstanceRequest();
                instanceRequest.setId(rs.getInt("id"));
                instanceRequest.setInstanceId(rs.getString("instanceId"));
                instanceRequest.setThreadName(rs.getString("threadName"));
                instanceRequest.setStartTime(rs.getLong("startTime"));
                instanceRequest.setEndTime(rs.getLong("endTime"));
                return instanceRequest;
            }
        });
        return result.toArray(new InstanceRequest[result.size()]);
    }
}
