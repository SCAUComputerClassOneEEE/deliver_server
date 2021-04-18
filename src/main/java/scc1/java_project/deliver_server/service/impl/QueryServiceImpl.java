package scc1.java_project.deliver_server.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import scc1.java_project.deliver_server.POJO.BillOfLastMonth;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.dbEntity.Transport;
import scc1.java_project.deliver_server.dao.BillStatisticsMapper;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.service.QueryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {
    @Resource
    private PackageMapper packageMapper;
    @Resource
    private BillStatisticsMapper billStatisticsMapper;

    @Override
    public List<SimpleOrderInfoBar> packageList(long customerId, int offset, int length) {
        return packageMapper.getSimpleOrderInfoBars(customerId, new RowBounds(offset, length));
    }

    @Override
    public List<Transport> getTransports(long orderId) {
        return packageMapper.getTransports(orderId);
    }

    @Override
    public List<Long> damageOfPackages(long customerId) {
        return packageMapper.getDamagePackOrderId(customerId);
    }

    @Override
    public Double arrearsLastMonth(long customerId) {
        return billStatisticsMapper.getLastMonthArrears(customerId);
    }

    @Override
    public BillOfLastMonth spendLastMonth(long customerId) {
        return billStatisticsMapper.getBillStatisticLastMonth(customerId);
    }
}


