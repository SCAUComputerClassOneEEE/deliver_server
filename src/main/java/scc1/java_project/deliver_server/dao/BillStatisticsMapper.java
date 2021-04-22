package scc1.java_project.deliver_server.dao;

import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.BillOfLastMonth;
import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.dbEntity.Bill;

import java.util.List;

public interface BillStatisticsMapper {
    /*获取上个月欠费*/
    Double getLastMonthArrears(long customerId);
    /*获取上个月的统计账单*/
    BillOfLastMonth getBillStatisticLastMonth(long customerId);
    /*获取消费排行榜*/
    List<ConsumptionOfLastYear> getTopConsumptionOfLastYear(RowBounds rowBounds);
    List<Bill> getBills(long customerId);
}
