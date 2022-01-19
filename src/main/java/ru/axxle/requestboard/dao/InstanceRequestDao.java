package ru.axxle.requestboard.dao;

import ru.axxle.requestboard.model.InstanceRequest;

public interface InstanceRequestDao {

    void create(InstanceRequest instanceRequest);

    InstanceRequest[] getAllOrderDesc();
}
