package scc1.java_project.deliver_server.web;

import org.apache.http.HttpRequest;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scc1.java_project.deliver_server.POJO.PackOrderBillInsertInfo;
import scc1.java_project.deliver_server.dbEntity.DamageRecord;
import scc1.java_project.deliver_server.dbEntity.Transport;
import scc1.java_project.deliver_server.dbEntity.Carrier;

import scc1.java_project.deliver_server.service.InsertService;
import scc1.java_project.deliver_server.service.QueryService;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping({"/insert"})
/**
 * 数据库的插入
 */
public class InsertController {
    @Resource
    private QueryService queryService ;
    @Resource
    private InsertService insertService;

    /**
     * create new carrier from admin
     * @param carrier entity carrier
     * @return 0-presence or 1-absence
     */
    @PostMapping(value = "/carriers")
    public void createOneCarrierIfAbsence(@RequestBody Carrier carrier) {
        insertService.insertCarrier(carrier);
    }

    @PostMapping(value = "/carriers_u")
    public void updateCarrierIfPresence(@RequestBody Carrier carrier) throws NotFoundException {
        insertService.updateCarrier(carrier);
    }

    /**
     * 新建一个订单。需要插入到三个表中（package、order、bill）
     */
    @RequestMapping(value = {"/order"}, method = {RequestMethod.POST})
    @Transactional
    public long createOrder(@RequestBody PackOrderBillInsertInfo packOrderBillInsertInfo) {
        System.out.println(packOrderBillInsertInfo);
        return insertService.createOrder(packOrderBillInsertInfo);
    }

    /**
     * 插入物流信息,由服务端提供
     */
    @RequestMapping(value = {"/transport"}, method = {RequestMethod.POST})
    public void insertTransport(@RequestBody Transport transport) {
        insertService.insertTransport(transport);
    }

    /**
     * 新增出事载体，服务端输入
     */
    @RequestMapping(value = {"/damageRecord"}, method = {RequestMethod.POST})
    public Object insertDamageRecord(@RequestBody DamageRecord damageRecord) {
        return insertService.insertDamageRecord(damageRecord);
    }

}
