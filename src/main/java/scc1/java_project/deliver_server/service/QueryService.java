package scc1.java_project.deliver_server.service;


import scc1.java_project.deliver_server.POJO.BillOfLastMonth;
import scc1.java_project.deliver_server.POJO.DamageRecord;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.POJO.Transport;

import java.math.BigDecimal;
import java.util.List;

public interface QueryService {
    List<SimpleOrderInfoBar> packageList(long customerId, int offset, int length);

    Transport transport(long orderId);

    DamageRecord damageOfPackages(long customerId);

    long arrearsLastMonth(long customerId);

    BillOfLastMonth spendLastMonth(long customerId);
}
