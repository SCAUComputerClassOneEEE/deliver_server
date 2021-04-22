package scc1.java_project.deliver_server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import scc1.java_project.deliver_server.service.QRPayService;

import javax.annotation.Resource;

@Controller
public class QRPayController {
    @Resource
    private QRPayService qrPayService;

    @RequestMapping("/QRPay")
    public String pay(@RequestParam("orderId") String orderId) {
        try {
            System.out.println(orderId);
            qrPayService.pay(orderId);
        } catch (RuntimeException e) {
            return "fail";
        }
        return "ok";
    }
}
