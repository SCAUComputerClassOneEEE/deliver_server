package scc1.java_project.deliver_server.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.POJO.Customer;
import scc1.java_project.deliver_server.service.UsersService;

import javax.annotation.Resource;

@RestController
@RequestMapping({"/user"})
/**
 * 客户和管理员的登入修改
 */
public class UsersController {
    @Resource
    private UsersService usersService;

    /**
     * 登入
     * @param phoneNumber 手机号
     * @param password 密码
     * @param type 用户类型（0客户，1管理员）用于不同的表
     * @return 客户对象，为null表示账号或密码错误
     */
    @RequestMapping(value = {"/login"}, method = {RequestMethod.GET})
    public Customer login(@RequestParam("phone_number") long phoneNumber,
                          @RequestParam("password") String password,
                          @RequestParam("type") int type) {
        System.out.println("phone_number:" + phoneNumber + " , password:" + password + ",type:" + type);
        return usersService.login(phoneNumber, password, type);
    }

    /**
     * 修改密码
     * @param phoneNumber 手机号
     * @param password 新密码
     * @param type 用户类型（0客户，1管理员）用于不同的表
     * @return 0表示修改失败，1表示修改成功(数字为update修改的行数)
     */
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public Customer modify(@RequestParam("phone_number") long phoneNumber,
                           @RequestParam("password") String password,
                           @RequestParam("type") int type){
        // 调用service层（service层调用dao层）
        return usersService.modify(phoneNumber, password, type);
    }
}
