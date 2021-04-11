package scc1.java_project.deliver_server.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class Transport {
    private Long transportId;
    private Long orderId;
    private Long carrierId;
    private String carrierType;
    private Long transportTimesOfCarrier;
    private Timestamp inputTime;
    private Timestamp outputTime;
    private Long nextCarrierId;
    private String nextCarrierType;
    private String status;
    private String detailMassage;
}
