package scc1.java_project.deliver_server.POJO;

import lombok.Data;

@Data
public class ConsumptionOfLastYear {
    private long orderId;
    private String customerName;
    private long consumption;
}
