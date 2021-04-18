package scc1.java_project.deliver_server.service.impl;


import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
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
    public Customer login(long phoneNumber, String password, int type) {
        return null;
    }

    @Override
    public int modify(long customerId, String newPassWd) {
        return userMapper.updatePassWd(customerId, newPassWd);
    }

    @Override
    public List<StreetStatistics> getTopStreet(RowBounds rowBounds) {
        return userMapper.getTopStreet(rowBounds);
    }
}
