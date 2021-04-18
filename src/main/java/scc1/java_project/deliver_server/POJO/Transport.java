package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.sql.Timestamp;

@Data
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
    private String detailMessage;
}
