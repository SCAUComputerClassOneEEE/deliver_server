package scc1.java_project.deliver_server.POJO;

import lombok.Data;

@Data
public class Carrier {
    private Long carrierId;
    private String  carrierType;
    private Long deliveryTimes;
    private String connectPhoneNumber;
    private String detailMessage;
}
