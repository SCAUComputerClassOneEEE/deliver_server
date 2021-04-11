package scc1.java_project.deliver_server.service;

import scc1.java_project.deliver_server.POJO.DamageRecord;
import scc1.java_project.deliver_server.POJO.Transport;

public interface InsertService {
    void createOrder();

    int insertTransport(Transport transport);

    int insertDamageRecord(DamageRecord damageRecord);
}
