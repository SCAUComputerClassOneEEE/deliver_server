package scc1.java_project.deliver_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("scc1.java_project.deliver_server.dao")
public class DeliverServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DeliverServerApplication.class, args);
    }
}
