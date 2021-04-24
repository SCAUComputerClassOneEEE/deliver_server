package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BillView {

    private long orderId;
    private Timestamp orderCreateTime;
    private String receiver;
    private String orderStatus;
    private double charge;
    private boolean isPaid;
}
