package scc1.java_project.deliver_server;

import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;
import scc1.java_project.deliver_server.dao.PackageMapper;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DeliverServerApplicationTests {
    static final String url = "http://localhost:8080";
    static final String usrsResource = "/usrs";

    @Resource
    private PackageMapper packageMapper;

    @Test
    void contextLoads() {
        List<SimpleOrderInfoBar> simpleOrderInfoBars = packageMapper.getSimpleOrderInfoBars(18899715136L,
                new RowBounds(0, 2));
        simpleOrderInfoBars.forEach(System.out::println);
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
