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
        System.out.println(userMapper.getOneCustomerById(13923658947L));
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
