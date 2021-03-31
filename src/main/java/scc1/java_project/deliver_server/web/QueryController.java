package scc1.java_project.deliver_server.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.service.QueryService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping({"/query"})
/**
 * 用于查询（客户和管理员都可登入）
 */
public class QueryController {
    @Resource
    private QueryService queryService ;


    /**
     * @param customerId 客户id
     * @return 所有该用户订单
     */
    @RequestMapping(value = {"/list"}, method = {RequestMethod.GET})
    public List<SimpleOrderInfoBar> packageList(@RequestParam("customer_id") int customerId) {
        return null;
    }


    /**
     * 通过订单号查询完整的物流信息
     */
    @RequestMapping(value = {"/transport"}, method = {RequestMethod.GET})
    public Object transport(@RequestParam("order_id") int orderId) {
        return null;
    }

    /**
     * 通过客户id查询损坏的包裹id
     */
    @RequestMapping(value = {"/damage"}, method = {RequestMethod.GET})
    public Object damageOfPackages(@RequestParam("customer_id") int customerId) {
        return null;
    }

    /**
     * 通过customer_id查询上个月的欠费
     */
    @RequestMapping(value = {"/arrears"}, method = {RequestMethod.GET})
    public Object arrearsLastMonth(@RequestParam("customer_id") int customerId) {
        return null;
    }


    /**
     * 通过用户id，并按服务类型对客户上个月的消费情况进行包裹数统计、消费金额统计
     */
    @RequestMapping(value = {"/spend"}, method = {RequestMethod.GET})
    public Object spendLastMonth(@RequestParam("customer_id") int customerId) {
        return null;
    }
}
