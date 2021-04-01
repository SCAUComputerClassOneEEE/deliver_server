package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.math.BigDecimal;

@Data
// 包裹
public class Package {
    private long packageId;
    private String packageType;
    private BigDecimal packageWeight;
    private byte isDangerous;
    private byte isInternational;
    private String detailMessage;
}
