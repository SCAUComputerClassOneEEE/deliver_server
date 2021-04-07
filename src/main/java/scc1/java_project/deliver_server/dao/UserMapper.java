package scc1.java_project.deliver_server.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.StreetStatistics;

import java.util.List;

public interface UserMapper {
    /*修改密码*/
    int updatePassWd(@Param("customerId") long customerId,
                      @Param("newPassWd") String newPassWd);

    /*获取街道人数排行榜*/
    List<StreetStatistics> getTopStreet(RowBounds rowBounds);
}
