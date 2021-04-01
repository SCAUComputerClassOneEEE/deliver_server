package scc1.java_project.deliver_server.service.impl;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import scc1.java_project.deliver_server.POJO.Customer;
import scc1.java_project.deliver_server.service.UsersService;

@Repository
public class UsersServiceImpl implements UsersService {
    @Override
    public Customer login(long phoneNumber, String password, int type) {
        return new Customer();
    }

    @Override
    public Customer modify(long phoneNumber, String password, int type) {
        return null;
    }
}
