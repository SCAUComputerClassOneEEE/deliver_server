package scc1.java_project.deliver_server.service.impl;


import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import scc1.java_project.deliver_server.POJO.NoteSimpleRecord;
import scc1.java_project.deliver_server.dbEntity.Customer;
import scc1.java_project.deliver_server.POJO.StreetStatistics;
import scc1.java_project.deliver_server.dao.UserMapper;
import scc1.java_project.deliver_server.service.UsersService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Customer login(long phoneNumber, String password, int type) throws Exception {
        Customer customer = userMapper.login(phoneNumber, password);
        if (customer == null)
            throw new Exception("查无此人");
        return customer;
    }

    @Override
    public NoteSimpleRecord getNoteSimpleRecord(long id) {
        return userMapper.getNoteSimpleRecord(id);
    }

    @Override
    public Customer getOneCustomerById(long customerId) {
        return userMapper.getOneCustomerById(customerId);
    }

    @Override
    public int modify(long customerId, String newPassWd) {
        return userMapper.updatePassWd(customerId, newPassWd);
    }

    @Override
    public List<StreetStatistics> getTopStreet(RowBounds rowBounds) {
        return userMapper.getTopStreet(rowBounds);
    }

    @Override
    public void updateCustomer(Customer customer) {
        userMapper.update(customer);
    }
}
