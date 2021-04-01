package scc1.java_project.deliver_server.web;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    public Object createOrder(@RequestParam("jsonStr") String jsonStr) {
        System.out.println(jsonStr);
        return null;
    }

    /**
     * 插入物流信息,由服务端提供
     */
    @RequestMapping(value = {"/transport"}, method = {RequestMethod.POST})
    public Object insertTransport(@RequestParam("newPackage") Map<String, Object> newTransport) {
        return null;
    }

    /**
     * 新增出事载体，服务端输入
     */
    @RequestMapping(value = {"/damageRecord"}, method = {RequestMethod.POST})
    public Object insertDamageRecord(@RequestParam("newPackage") Map<String, Object> newDamageRecord) {
        return null;
    }

}
