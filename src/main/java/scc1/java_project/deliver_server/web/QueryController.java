package scc1.java_project.deliver_server.web;

import org.springframework.web.bind.annotation.*;
import scc1.java_project.deliver_server.POJO.BillOfLastMonth;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.dbEntity.Transport;
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
//    @Autowired
    private QueryService queryService ;

    /**
     * @param customerId 客户id
     * @return 所有该用户订单
     */
    @GetMapping(value = {"/list"})
    public List<SimpleOrderInfoBar> packageList(@RequestParam("customer_id") long customerId,
                                                @RequestParam("offset") int offset,
                                                @RequestParam("length") int length) {
        return queryService.packageList(customerId, offset, length);
    }


    /**
     * 通过订单号查询完整的物流信息
     */
    @RequestMapping(value = {"/transport"}, method = {RequestMethod.GET})
    public List<Transport> getTransports(@RequestParam("order_id") long orderId) {
        return queryService.getTransports(orderId);
    }

    /**
     * 通过客户id查询损坏的包裹id
     */
    @RequestMapping(value = {"/damage"}, method = {RequestMethod.GET})
    public List<Long> damageOfPackages(@RequestParam("customer_id") long customerId) {
        return queryService.damageOfPackages(customerId);
    }

    /**
     * 通过customer_id查询上个月的欠费
     */
    @RequestMapping(value = {"/arrears"}, method = {RequestMethod.GET})
    public Double arrearsLastMonth(@RequestParam("customer_id") long customerId) {
        return queryService.arrearsLastMonth(customerId) == null ? 0.0 : queryService.arrearsLastMonth(customerId);
    }


    /**
     * 通过用户id，并按服务类型对客户上个月的消费情况进行包裹数统计、消费金额统计
     */
    @RequestMapping(value = {"/spend"}, method = {RequestMethod.GET})
    public BillOfLastMonth spendLastMonth(@RequestParam("customer_id") long customerId) {
        return queryService.spendLastMonth(customerId);
    }
}
