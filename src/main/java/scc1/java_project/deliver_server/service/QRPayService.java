package scc1.java_project.deliver_server.service;

public interface QRPayService {
    boolean pay(String orderId) throws RuntimeException;
}
