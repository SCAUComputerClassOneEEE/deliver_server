package scc1.java_project.deliver_server.dbEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transport {
    private long transportId;
    private long orderId;
    private long carrierId;
    private String carrierType;
    private long transportTimesOfCarrier;
    private Timestamp inputTime;
    private Timestamp outputTime;
    private long nextCarrierId;
    private String nextCarrierType;
    private String status;
    private String transDetailMessage;
}
