package scc1.java_project.deliver_server.service;

import scc1.java_project.deliver_server.POJO.PackOrderBillInsertInfo;
import scc1.java_project.deliver_server.dbEntity.DamageRecord;
import scc1.java_project.deliver_server.dbEntity.Transport;
import scc1.java_project.deliver_server.dbEntity.Carrier;

public interface InsertService {
    Long createOrder(PackOrderBillInsertInfo packOrderBillInsertInfo);

    int insertTransport(Transport transport);

    int insertDamageRecord(DamageRecord damageRecord);

    void insertCarrier(Carrier carrier);

    void updateCarrier(Carrier carrier);
}
