package scc1.java_project.deliver_server.service;

import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;

import java.util.List;
import java.util.Map;

public interface RankingListService {
    /*获取去年的寄件排行榜*/
    List<NumberOfLastYear> getTopNumberOfLastYear(RowBounds rowBounds);

    /*获取消费排行榜*/
    List<ConsumptionOfLastYear> consumeList(RowBounds rowBounds);

}
