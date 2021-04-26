package scc1.java_project.deliver_server.web;

import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.*;
import scc1.java_project.deliver_server.POJO.NoteSimpleRecord;
import scc1.java_project.deliver_server.dbEntity.Customer;
import scc1.java_project.deliver_server.POJO.StreetStatistics;
import scc1.java_project.deliver_server.service.UsersService;

import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"/user"})
/**
 * 客户和管理员的登入修改
 */
public class UsersController {

    private static final Map<String, String> adminMap = new HashMap<>();

    static {
        InputStream resourceAsStream = UsersController.class.getResourceAsStream("/static/adminLogin.txt");
        assert resourceAsStream != null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
        String s;
        try {
            while ((s = bufferedReader.readLine()) != null) {
                String[] s1 = s.split(" ");
                adminMap.put(s1[0], s1[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(adminMap);
    }

    @Resource
    private UsersService usersService;

    /**
     * 登入
     * @param phoneNumber 手机号
     * @param password 密码
     * @param type 用户类型（0客户，1管理员）用于不同的表
     */
    @RequestMapping(value = {"/login"}, method = {RequestMethod.GET})
    public Customer login(@RequestParam("phone_number") long phoneNumber,
                          @RequestParam("password") String password,
                          @RequestParam("type") int type) throws Exception {
        if (type == 0) return usersService.login(phoneNumber, password, type);
        else {
            String s = adminMap.get(String.valueOf(phoneNumber));
            if ( s != null && !s.equals(password)) {
                Customer customer = new Customer();
                customer.setCustomerName(String.valueOf(phoneNumber));
                customer.setCustomerPassword(password);
                return customer;
            }
            else return null;
        }
    }

    /**
     * 修改密码
     * @param customerId 客户id
     * @param password 新密码
     * @return 是否修改成功
     */
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public boolean modify(@RequestParam("customerId") long customerId,
                           @RequestParam("newPassWd") String password){
        // 调用service层（service层调用dao层）
        System.out.println("1");
        return usersService.modify(customerId, password) > 0;
    }

    @GetMapping(value = "/customer")
    public Customer getOneCustomer(@RequestParam("customer_id") long customerId) {
        return usersService.getOneCustomerById(customerId);
    }

    @GetMapping(value = "/note")
    public List<NoteSimpleRecord> getNoteSimpleRecord(@RequestParam("customer_id") long customerId) {
        return usersService.getNoteSimpleRecord(customerId);
    }

    /*获取街道人数排行榜*/
    @RequestMapping(value = "/street", method = RequestMethod.GET)
    public List<StreetStatistics> getTopStreet(@Param("offset") int offset, @Param("length") int length) {
            System.out.println("??");
            return usersService.getTopStreet(new RowBounds(offset, length));
    }

    @PostMapping("/customer")
    public void updateCustomer(@RequestBody Customer customer) {
        usersService.updateCustomer(customer);
    }
}
