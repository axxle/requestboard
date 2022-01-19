package ru.axxle.requestboard.model;

public class InstanceRequest {
    private long id;
    private String instanceId;
    private String threadName;
    private long startTime;
    private long endTime;

    public InstanceRequest() {
    }

    public InstanceRequest(long id, String instanceId, String threadName, long startTime, long endTime) {
        this.id = id;
        this.instanceId = instanceId;
        this.threadName = threadName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
