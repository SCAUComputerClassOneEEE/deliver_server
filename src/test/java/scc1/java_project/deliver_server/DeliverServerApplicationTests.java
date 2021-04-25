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
        packageMapper.getSimpleOrderInfoBars(18899715136L,
                new RowBounds(2, 5)).forEach(System.out::println);
//        simpleOrderInfoBars.forEach(System.out::println);
//        List<Transport> transports = packageMapper.getTransports(1);
//        transports.forEach(System.out::println);
//        System.out.println(packageMapper.getDamagePackOrderId(1));
//        System.out.println(billStatisticsMapper.getLastMonthArrears(1));
//        System.out.println(billStatisticsMapper.getBillStatisticLastMonth(1));
//        userMapper.updatePassWd(18899715136L,"newPass");
//        System.out.println(packageMapper.getNumberOfLastYear(new RowBounds(0, 10)));
//        System.out.println(billStatisticsMapper.getConsumptionOfLastYear(new RowBounds(0, 10)));
//        System.out.println(userMapper.getTopStreet(new RowBounds(0, 10)));
    }

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    void kMethod() {
        ListNode head = new ListNode(Integer.MAX_VALUE);
        ListNode p = head;
        int k = 3, i = 0;
        while(i < 10) {
            p.next = new ListNode(i);
            p = p.next;
            i ++;
        }
        System.out.println(getNext(head,k));
    }

    int getNext(ListNode p, int k) {
        int layer = 0;
        if (p.next == null) {
            return layer + 1;
        }
        if ((layer += getNext(p.next, k) + 1) == k)
            System.out.println(p.data);
        return layer;
    }

}
