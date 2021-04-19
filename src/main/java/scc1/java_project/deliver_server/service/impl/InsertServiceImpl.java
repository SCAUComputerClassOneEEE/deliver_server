package scc1.java_project.deliver_server.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import scc1.java_project.deliver_server.dao.InsertMapper;
import scc1.java_project.deliver_server.dbEntity.Bill;
import scc1.java_project.deliver_server.dbEntity.DamageRecord;
import scc1.java_project.deliver_server.dbEntity.Order;
import scc1.java_project.deliver_server.dbEntity.Package;
import scc1.java_project.deliver_server.dbEntity.Transport;
import scc1.java_project.deliver_server.service.InsertService;

import javax.annotation.Resource;


@Repository
public class InsertServiceImpl implements InsertService {
    @Resource
    private InsertMapper insertMapper;

    @Override
    @Transactional
    public void createOrder() {
//        insertMapper.insertPackage(new Package(9l, "big", 3.22, false, true, null));
//        insertMapper.insertOrder(new Order(4l,4l));
//        System.out.println(10 / 0);
//        insertMapper.insertBill(new Bill(4l, 13512742057l, null, 12l , null, false));
    }

    @Override
    public int insertTransport(Transport transport) {
        return insertMapper.insertTransport(transport);
    }

    @Override
    public int insertDamageRecord(DamageRecord damageRecord) {
        return insertMapper.insertDamageRecord(damageRecord);
    }
}
