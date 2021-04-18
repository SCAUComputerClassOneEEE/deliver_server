package scc1.java_project.deliver_server.web;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import scc1.java_project.deliver_server.POJO.PackOrderBillInsertInfo;
import scc1.java_project.deliver_server.dbEntity.DamageRecord;
import scc1.java_project.deliver_server.dbEntity.Transport;
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

    /**
     * 新建一个订单。需要插入到三个表中（package、order、bill）
     */
    @RequestMapping(value = {"/order"}, method = {RequestMethod.POST})
    @Transactional
    public void createOrder(@RequestBody PackOrderBillInsertInfo packOrderBillInsertInfo) {

    }

    /**
     * 插入物流信息,由服务端提供
     */
    @RequestMapping(value = {"/transport"}, method = {RequestMethod.POST})
    public Object insertTransport(@RequestBody Transport transport) {
        return null;
    }

    /**
     * 新增出事载体，服务端输入
     */
    @RequestMapping(value = {"/damageRecord"}, method = {RequestMethod.POST})
    public Object insertDamageRecord(@RequestBody DamageRecord damageRecord) {
        return null;
    }

}
