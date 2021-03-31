package scc1.java_project.deliver_server.service;


import scc1.java_project.deliver_server.POJO.Customer;

public interface UsersService {
    Customer login(long phoneNumber, String password, int type);

    Customer modify(long phoneNumber, String password, int type);
}
