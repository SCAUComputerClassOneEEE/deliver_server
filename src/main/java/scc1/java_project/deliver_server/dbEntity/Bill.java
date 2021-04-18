package scc1.java_project.deliver_server.dbEntity;

import lombok.Data;

@Data
// 账单
public class Bill {
    private long orderId;
    private long customerId;
    private long charge;
    private long batchNumber;
    private String payType;
    private Boolean isPaid;

}
