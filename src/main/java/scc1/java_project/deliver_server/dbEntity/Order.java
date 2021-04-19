package scc1.java_project.deliver_server.dbEntity;

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

    public Order(long orderId, long packageId) {
        this.orderId = orderId;
        this.packageId = packageId;
    }
}
