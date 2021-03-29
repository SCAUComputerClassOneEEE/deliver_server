package scc1.java_project.deliver_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("scc1.java_project.deliver_server.dao")
public class DeliverServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliverServerApplication.class, args);
    }

}
