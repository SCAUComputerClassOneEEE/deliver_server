package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BillOfLastMonth {
    private String payType;
    private Integer count;
    private BigDecimal number;
}
