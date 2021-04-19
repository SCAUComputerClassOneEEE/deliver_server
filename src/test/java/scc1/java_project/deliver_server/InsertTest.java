package scc1.java_project.deliver_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scc1.java_project.deliver_server.dao.InsertMapper;
import scc1.java_project.deliver_server.dbEntity.*;
import scc1.java_project.deliver_server.dbEntity.Package;
import scc1.java_project.deliver_server.service.InsertService;

import javax.annotation.Resource;

@SpringBootTest
public class InsertTest {
    @Resource
    private InsertMapper insertMapper;
    @Resource
    private InsertService insertService;

    @Test
    public void insertPackage() {
//        insertMapper.insertPackage(new Package(9l, "big", 3.22, false, true, null));
//        insertMapper.insertOrder(new Order(4,4));
//        insertMapper.insertBill(new Bill(4l, 13512742057l, null, 12l , null, false));
//        insertMapper.insertDamageRecord(new DamageRecord(2l, "warehouse", null));
//        insertMapper.insertTransport(new Transport(8l, 1l, 5l, "sky", 13l, null, null, 0l, "end", null, null));
    }

    @Test
    public void insertService() {
//        insertService.insertDamageRecord(new DamageRecord(3l, "warehouse", null));
//        insertMapper.insertTransport(new Transport(6l, 1l, 5l, "sky", null, null, null, 0l, "end", null, null));
//        insertService.createOrder();
    }


}
