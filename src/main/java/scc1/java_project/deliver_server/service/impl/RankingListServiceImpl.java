package scc1.java_project.deliver_server.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;
import scc1.java_project.deliver_server.dao.BillStatisticsMapper;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.service.RankingListService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class RankingListServiceImpl implements RankingListService {
    @Resource
    private PackageMapper packageMapper;
    @Resource
    private BillStatisticsMapper billStatisticsMapper;

    @Override
    public List<NumberOfLastYear> getTopNumberOfLastYear(RowBounds rowBounds) {
        return packageMapper.getTopNumberOfLastYear(rowBounds);
    }

    @Override
    public List<ConsumptionOfLastYear> consumeList(RowBounds rowBounds) {
        return billStatisticsMapper.getTopConsumptionOfLastYear(rowBounds);
    }

}
