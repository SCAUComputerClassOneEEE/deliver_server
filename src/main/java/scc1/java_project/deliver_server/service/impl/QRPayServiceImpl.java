package scc1.java_project.deliver_server.service.impl;

import org.springframework.stereotype.Service;
import scc1.java_project.deliver_server.dao.PackageMapper;
import scc1.java_project.deliver_server.service.QRPayService;

import javax.annotation.Resource;

@Service
public class QRPayServiceImpl implements QRPayService {
    @Resource
    private PackageMapper packageMapper;

    @Override
    public void pay(long orderId){
        packageMapper.delBill(orderId);
    }
}
