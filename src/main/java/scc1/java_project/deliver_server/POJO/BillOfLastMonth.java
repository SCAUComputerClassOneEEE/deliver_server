package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BillOfLastMonth {
    private long customerId;
    private int sendPacksCount;
    private int moneyNumber;
    private double lastMonthArrears;
}
