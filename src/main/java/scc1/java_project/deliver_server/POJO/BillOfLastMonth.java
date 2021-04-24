package scc1.java_project.deliver_server.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public class BillOfLastMonth {
    private long customerId;
    private Integer sendPacksCount;
    private Double moneyNumber;
    private Double lastMonthArrears;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Integer getSendPacksCount() {
        return sendPacksCount;
    }

    public void setSendPacksCount(Integer sendPacksCount) {
        this.sendPacksCount = sendPacksCount;
    }

    public Double getMoneyNumber() {
        return moneyNumber;
    }

    public void setMoneyNumber(Double moneyNumber) {
        this.moneyNumber = moneyNumber;
    }

    public Double getLastMonthArrears() {
        return lastMonthArrears;
    }

    public void setLastMonthArrears(Double lastMonthArrears) {
        this.lastMonthArrears = lastMonthArrears;
    }

    public BillOfLastMonth() {
    }

    public BillOfLastMonth(long customerId, Integer sendPacksCount, Double moneyNumber, Double lastMonthArrears) {
        this.customerId = customerId;
        this.sendPacksCount = sendPacksCount;
        this.moneyNumber = moneyNumber;
        this.lastMonthArrears = lastMonthArrears;
    }
}
