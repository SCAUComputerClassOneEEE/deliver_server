package scc1.java_project.deliver_server.dbEntity;

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
    private Integer charge;
    private Integer batchNumber;
    private String payType;
    private Boolean isPaid;

}
