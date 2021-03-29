package scc1.java_project.deliver_server.service;


public interface QueryService {
    Object packageList(int customerId);

    Object transport(int orderId);

    Object damageOfPackages(int customerId);

    Object arrearsLastMonth(int customerId);

    Object spendLastMonth(int customerId);
}
