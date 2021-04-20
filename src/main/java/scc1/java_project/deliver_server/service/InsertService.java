package scc1.java_project.deliver_server.service;

import scc1.java_project.deliver_server.POJO.PackOrderBillInsertInfo;
import scc1.java_project.deliver_server.dbEntity.DamageRecord;
import scc1.java_project.deliver_server.dbEntity.Transport;

public interface InsertService {
    void createOrder(PackOrderBillInsertInfo packOrderBillInsertInfo);

    int insertTransport(Transport transport);

    int insertDamageRecord(DamageRecord damageRecord);
}
