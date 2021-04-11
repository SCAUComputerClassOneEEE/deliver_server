package scc1.java_project.deliver_server.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 账单
public class Bill {
    private Long orderId;
    private Long customerId;
    private Long charge;
    private Long batchNumber;
    private String payType;
    private Boolean isPaid;

}
