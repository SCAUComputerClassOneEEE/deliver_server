package scc1.java_project.deliver_server;

import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.dao.BillStatisticsMapper;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.dao.UserMapper;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DeliverServerApplicationTests {

    @Resource
    private PackageMapper packageMapper;
    @Resource
    private BillStatisticsMapper billStatisticsMapper;
    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.getNoteSimpleRecord(18899715136L));
    }

}
