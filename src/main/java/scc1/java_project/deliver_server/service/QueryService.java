package scc1.java_project.deliver_server.service;


import scc1.java_project.deliver_server.POJO.*;
import scc1.java_project.deliver_server.dbEntity.Bill;
import scc1.java_project.deliver_server.dbEntity.Transport;

import java.util.List;

public interface QueryService {
    /**
     * 获取用户的简单订单信息
     */
    List<SimpleOrderInfoBar> packageList(long customerId, int offset, int length);

    /**
     * 获取某订单的全部运输流程
     */
    List<Transport> getTransports(long orderId);

    /**
     * 获取用户的损坏包裹订单号
     */
    List<Long> damageOfPackages(long customerId);

    Double arrearsLastMonth(long customerId);

    BillOfLastMonth spendLastMonth(long customerId);

    List<BillView> getBills(long customerId);
}
