package scc1.java_project.deliver_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scc1.java_project.deliver_server.POJO.PackOrderBillInsertInfo;
import scc1.java_project.deliver_server.dao.BillStatisticsMapper;
import scc1.java_project.deliver_server.dao.InsertMapper;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.dbEntity.*;
import scc1.java_project.deliver_server.dbEntity.Package;
import scc1.java_project.deliver_server.service.InsertService;
import scc1.java_project.deliver_server.web.InsertController;
import scc1.java_project.deliver_server.web.UsersController;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.Timestamp;

@SpringBootTest
public class InsertTest {
    @Resource
    private InsertMapper insertMapper;
    @Resource
    private InsertService insertService;
    @Resource
    private InsertController insertController;
    @Resource
    private UsersController usersController;

    @Test
    public void insertPackage() { // 收件人
        PackOrderBillInsertInfo insertInfo = new PackOrderBillInsertInfo("sky", "18899715136", "yangjiang",
                "zhl", "13512742057", "a", new Timestamp(13512742057l),
                "big", null, 10.1, false, false,
                null, 12, 18899715136l);
        insertController.createOrder(insertInfo);
//        PackOrderBillInsertInfo info = new PackOrderBillInsertInfo("1","2","3","4","5");
//        insertController.createOrder(info);
//        System.out.println(insertMapper.insertPackage(new Package(9l, "big", 3.22, false, true, null)));
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

    @Test
    public void login() {
        try {
            usersController.login(13512742057l, "newPSD", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void update() {
        usersController.updateCustomer(new Customer(13923658947l, "newPSD1", "lyx", null, null, null, null, null));
    }


    @Resource
    private BillStatisticsMapper billStatisticsMapper;
    @Test
    public void why() {
        System.out.println(billStatisticsMapper.test(18899715136l));
    }

    @Resource
    private PackageMapper packageMapper;

    @Test
    public void pob() {
        System.out.println(packageMapper.getPackOrderBillInsertInfo(12));
    }
}
