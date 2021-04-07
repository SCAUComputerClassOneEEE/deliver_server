package scc1.java_project.deliver_server.dao;

import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.POJO.Transport;

import java.util.List;

public interface PackageMapper {
    /*获取订单分页*/
    List<SimpleOrderInfoBar> getSimpleOrderInfoBars(long customerId, RowBounds rowBounds);
    /*获取某个订单的全部运输流程*/
    List<Transport> getTransports(int orderId);
    /*获取该客户出事的所有包裹*/
    List<Integer> getDamagePackOrderId(long customerId);
    /*获取去年的寄件排行榜*/
    List<NumberOfLastYear> getTopNumberOfLastYear(RowBounds rowBounds);
}
