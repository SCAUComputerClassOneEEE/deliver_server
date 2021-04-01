package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.sql.Date;

@Data
public class Transport {
    private long transportId;
    private long orderId;
    private long carrierId;
    private String carrierType;
    private long transportTimesOfCarrier;
    private Date inputTime;
    private Date outputTime;
    private long nextCarrierId;
    private String nextCarrierType;
}
