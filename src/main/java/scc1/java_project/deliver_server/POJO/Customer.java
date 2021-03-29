package scc1.java_project.deliver_server.POJO;

import lombok.Data;

@Data
public class Customer {
    private int customerId;
    private long customerPhoneNumber;
    private String customerPassword;
    private String customerName;
    private String city;
    private String street;
    private String detailAddress;
    private String account;
}
