package scc1.java_project.deliver_server.dao;

import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.dbEntity.Bill;
import scc1.java_project.deliver_server.dbEntity.Order;
import scc1.java_project.deliver_server.dbEntity.Package;
import scc1.java_project.deliver_server.dbEntity.Transport;

import java.util.List;

public interface PackageMapper {
    /*获取订单分页*/
    List<SimpleOrderInfoBar> getSimpleOrderInfoBars(long customerId, RowBounds rowBounds);
    /*获取某个订单的全部运输流程*/
    List<Transport> getTransports(long orderId);
    /*获取该客户出事的所有包裹*/
    List<Long> getDamagePackOrderId(long customerId);
    /*获取去年的寄件排行榜*/
    List<NumberOfLastYear> getTopNumberOfLastYear(RowBounds rowBounds);

    /*删除账单*/
    int delBill(Long billId);
}
