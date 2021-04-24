package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BillOfLastMonth {
    private long customerId;
    private Integer sendPacksCount;
    private Double moneyNumber;
    private Double lastMonthArrears;
}
