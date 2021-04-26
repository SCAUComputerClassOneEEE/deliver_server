package scc1.java_project.deliver_server.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import scc1.java_project.deliver_server.POJO.PackOrderBillInsertInfo;
import scc1.java_project.deliver_server.dao.InsertMapper;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.dbEntity.Bill;
import scc1.java_project.deliver_server.dbEntity.DamageRecord;
import scc1.java_project.deliver_server.dbEntity.Order;
import scc1.java_project.deliver_server.dbEntity.Package;
import scc1.java_project.deliver_server.dbEntity.Transport;
import scc1.java_project.deliver_server.dbEntity.Carrier;
import scc1.java_project.deliver_server.service.InsertService;
import scc1.java_project.deliver_server.service.QueryService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;


@Repository
public class InsertServiceImpl implements InsertService {
    @Resource
    private InsertMapper insertMapper;
    @Resource
    private PackageMapper packageMapper;

    @Override
    @Transactional
    public Long createOrder(PackOrderBillInsertInfo info) {
        Package aPackage = new Package(null, info.getPackType(),
                info.getPackWeight(), info.getDangerous(), info.getInter(), info.getDetailMess());
        insertMapper.insertPackage(aPackage);
        System.out.println("packageId:" + aPackage.getPackageId());
        Order order = new Order(null, aPackage.getPackageId(), info.getShipperName(), info.getShipperPhoneNumber(), info.getDeparture(),
                info.getConsiggeeName(), info.getConsiggeePhoneNumber(), info.getAddress(), new Timestamp(new Date().getTime()), info.getCommitArriveTime(), null,
                "揽件中", false);
        insertMapper.insertOrder(order);
        System.out.println("orderId:" + order.getOrderId());
        Bill bill = new Bill(order.getOrderId(), info.getCustomerId(), info.getCharge(), null, info.getPayType(), false);
        insertMapper.insertBill(bill);
        return order.getOrderId();
    }

    @Override
    public int insertTransport(Transport transport) {
        return insertMapper.insertTransport(transport);
    }

    @Override
    public int insertDamageRecord(DamageRecord damageRecord) {
        return insertMapper.insertDamageRecord(damageRecord);
    }

    @Override
    public void insertCarrier(Carrier carrier) {
        insertMapper.insertCarrier(carrier);
    }

    @Override
    public void updateCarrier(Carrier carrier) {
        insertMapper.updateCarrier(carrier);
    }
}
