package scc1.java_project.deliver_server.dbEntity;

import lombok.Data;

@Data
public class Carrier {
    private Long carrierId;
    private String  carrierType;
    private Long deliveryTimes;
    private String connectPhoneNumber;
    private String detailMessage;

    public Carrier() {
        carrierId = 0L;
        carrierType = "end";
        deliveryTimes = 1L;
    }
}
