package scc1.java_project.deliver_server.dbEntity;

import lombok.Data;

@Data
// 客户
public class Customer {
    private long customerId;
    private long customerPhoneNumber;
    private String customerPassword;
    private String customerName;
    private String city;
    private String street;
    private String detailAddress;
    private String account;
}
