package scc1.java_project.deliver_server.dbEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 包裹
public class Package {
    private Long packageId;
    private String packageType;
    private Double packageWeight;
    private Boolean isDangerous;
    private Boolean isInternational;
    private String detailMessage;
}
