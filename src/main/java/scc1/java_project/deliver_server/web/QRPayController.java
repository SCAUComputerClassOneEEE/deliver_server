package scc1.java_project.deliver_server.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.service.QRPayService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class QRPayController {
    @Resource
    private QRPayService qrPayService;

    @RequestMapping("/QRPay")
    public void pay(List<Long> orderId) {
        for (Long aLong : orderId) {
            qrPayService.pay(aLong);
        }
    }
}
