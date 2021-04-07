package scc1.javaProject.deliver_server.POJO;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
// 订单
public class Order {
    private long orderId;
    private long packageId;
    private String sendName;
    private String sendPhoneNumber;
    private String sendDetailAddress;
    private String receiveName;
    private String receivePhoneNumber;
    private String receiveDetailAddress;
    private Timestamp orderCreateTime;
    private Timestamp commitArriveTime;
    private Timestamp actualArriveTime;
    private String orderStatus;
    private Boolean isReturned;
}
