package scc1.java_project.deliver_server.POJO;

import lombok.Data;

@Data
public class ConsumptionOfLastYear {
    private Long orderId;
    private String customerName;
    private Double consumption;
}
