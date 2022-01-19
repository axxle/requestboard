package ru.axxle.requestboard.service;

import ru.axxle.requestboard.model.InstanceRequest;

public interface InstanceRequestService {

    void create(InstanceRequest instanceRequest);

    InstanceRequest[] getAllOrderDesc();
}
