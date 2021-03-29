package scc1.java_project.deliver_server.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.POJO.Customer;

@RestController
@RequestMapping("/customers")
public class UsersController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Customer login(
            @RequestParam("phone_number") long phoneNumber,
            @RequestParam("password") String password) {
        Customer customer = new Customer();
        customer.setCustomerPhoneNumber(phoneNumber);
        customer.setCustomerName("神秘的测试人五");
        customer.setCustomerPassword(password);
        return customer;
    }
}
