package scc1.java_project.deliver_server.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DamageRecord {
    private Long carrierId;
    private String carrierType;
    private Long damageRecordTime;
}
