package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class SimpleOrderInfoBar {
    private Integer orderId;
    private Timestamp orderCreateTime;
    private String receiveName;
    private String orderStatus;
    private String sendDetailAddress;
    private String receiveDetailAddress;
}
