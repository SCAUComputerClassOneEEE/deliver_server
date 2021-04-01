package scc1.java_project.deliver_server.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import scc1.java_project.deliver_server.POJO.BillOfLastMonth;
import scc1.java_project.deliver_server.POJO.DamageRecord;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.POJO.Transport;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.service.QueryService;

import javax.annotation.Resource;
import java.util.List;

//@Repository
@Service
public class QueryServiceImpl implements QueryService {
//    @Autowired
    @Resource
    private PackageMapper packageMapper;

    @Override
    public List<SimpleOrderInfoBar> packageList(long customerId, int offset, int length) {
        List<SimpleOrderInfoBar> simpleOrderInfoBars = packageMapper.getSimpleOrderInfoBars(customerId, new RowBounds(offset, length));
        simpleOrderInfoBars.forEach(System.out::println);
        return simpleOrderInfoBars;
    }

    @Override
    public Transport transport(long orderId) {
        return null;
    }

    @Override
    public DamageRecord damageOfPackages(long customerId) {
        return null;
    }

    @Override
    public long arrearsLastMonth(long customerId) {
        return 0;
    }

    @Override
    public BillOfLastMonth spendLastMonth(long customerId) {
        return null;
    }
}


