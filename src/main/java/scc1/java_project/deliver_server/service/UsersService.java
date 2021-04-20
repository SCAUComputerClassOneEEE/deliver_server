package scc1.java_project.deliver_server.service;

import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.dbEntity.Customer;
import scc1.java_project.deliver_server.POJO.StreetStatistics;

import java.util.List;

public interface UsersService {
    Customer login(long phoneNumber, String password, int type) throws Exception;

    int modify(long customerId, String newPassWd);

    /*获取街道人数排行榜*/
    List<StreetStatistics> getTopStreet(RowBounds rowBounds);
}
