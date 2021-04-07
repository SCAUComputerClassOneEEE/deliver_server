package scc1.java_project.deliver_server.web;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.POJO.Customer;
import scc1.java_project.deliver_server.POJO.StreetStatistics;
import scc1.java_project.deliver_server.service.UsersService;

import javax.annotation.Resource;
import java.util.List;

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
     * @param customerId 客户id
     * @param password 新密码
     * @return 是否修改成功
     */
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public boolean modify(@RequestParam("customerId") long customerId,
                           @RequestParam("newPassWd") String password){
        // 调用service层（service层调用dao层）
        System.out.println("1");
        return usersService.modify(customerId, password) > 0 ? true : false;
    }

    /*获取街道人数排行榜*/
    @RequestMapping(value = "/street", method = RequestMethod.GET)
    public List<StreetStatistics> getTopStreet(@Param("offset") int offset, @Param("length") int length) {
        return usersService.getTopStreet(new RowBounds(offset, length));
    }
}
