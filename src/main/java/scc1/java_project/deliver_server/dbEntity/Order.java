package scc1.java_project.deliver_server.dbEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 订单
public class Order {
    private Long orderId;
    private Long packageId;
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
