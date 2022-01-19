DROP TABLE IF EXISTS INSTANCE_REQUEST;

CREATE TABLE INSTANCE_REQUEST
(
    id                BIGSERIAL,
    instanceId        VARCHAR(255)  NOT NULL,
    threadName        VARCHAR(255),
    startTime         bigint        NOT NULL,
    endTime           bigint
);

COMMIT;
