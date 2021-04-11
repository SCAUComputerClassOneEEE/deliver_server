package scc1.java_project.deliver_server.POJO;

import lombok.Data;

@Data
// 客户
public class Customer {
    private Long customerId;
    private Long customerPhoneNumber;
    private String customerPassword;
    private String customerName;
    private String city;
    private String street;
    private String detailAddress;
    private String account;
}
