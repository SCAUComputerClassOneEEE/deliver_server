package scc1.java_project.deliver_server.dbEntity;

import lombok.Data;

@Data
public class DamageRecord {
    private long carrierId;
    private String carrierType;
    private long damageRecordTime;
}
