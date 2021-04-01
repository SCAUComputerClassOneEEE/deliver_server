package scc1.java_project.deliver_server.POJO;

import lombok.Data;

@Data
public class Carrier {
    private long carrierId;
    private String  carrierType;
    private long deliveryTimes;
    private String connectPhoneNumber;
    private String detailMessage;
}
