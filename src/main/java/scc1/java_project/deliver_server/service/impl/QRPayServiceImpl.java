package scc1.java_project.deliver_server.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.service.QRPayService;

import javax.annotation.Resource;

@Service
public class QRPayServiceImpl implements QRPayService {
    @Resource
    private PackageMapper packageMapper;

    @Override
    @Transactional
    public boolean pay(String orderId) throws RuntimeException {
        String[] ids = orderId.split(",");
        for (String id : ids) {
            if (packageMapper.delBill(Long.parseLong(id)) <= 0) {
                throw new RuntimeException("订单不存在");
            }
        }
        return true;
    }
}
