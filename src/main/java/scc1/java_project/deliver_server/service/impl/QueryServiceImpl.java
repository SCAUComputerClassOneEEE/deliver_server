package scc1.java_project.deliver_server.service.impl;

import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.service.QueryService;

import java.util.List;

public class QueryServiceImpl implements QueryService {
    @Override
    public List<SimpleOrderInfoBar> packageList(int customerId) {
        return null;
    }

    @Override
    public Object transport(int orderId) {
        return null;
    }

    @Override
    public Object damageOfPackages(int customerId) {
        return null;
    }

    @Override
    public Object arrearsLastMonth(int customerId) {
        return null;
    }

    @Override
    public Object spendLastMonth(int customerId) {
        return null;
    }
}
