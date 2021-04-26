package scc1.java_project.deliver_server.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.StreetStatistics;
import scc1.java_project.deliver_server.dbEntity.Customer;

import java.util.List;

public interface UserMapper {
    /*修改密码*/
    int updatePassWd(long customerId, String newPassWd);

    /*获取街道人数排行榜*/
    List<StreetStatistics> getTopStreet(RowBounds rowBounds);

    /*登入*/
    Customer login(long customerId, String passWd);

    /*更新用户*/
    void update(Customer customer);

    Customer getOneCustomerById(long id);
}
