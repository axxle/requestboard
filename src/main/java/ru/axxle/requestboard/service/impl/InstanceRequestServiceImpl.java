package ru.axxle.requestboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.axxle.requestboard.dao.InstanceRequestDao;
import ru.axxle.requestboard.model.InstanceRequest;
import ru.axxle.requestboard.service.InstanceRequestService;

@Service
public class InstanceRequestServiceImpl implements InstanceRequestService {

    @Autowired
    private InstanceRequestDao dao;

    @Override
    public void create(InstanceRequest instanceRequest) {
        //sleep
        dao.create(instanceRequest);
    }

    @Override
    public InstanceRequest[] getAllOrderDesc() {
        return dao.getAllOrderDesc();
    }

    public InstanceRequestDao getDao() {
        return dao;
    }

    public void setDao(InstanceRequestDao dao) {
        this.dao = dao;
    }
}
