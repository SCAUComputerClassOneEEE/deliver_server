package scc1.java_project.deliver_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("scc1.java_project.deliver_server.dao")
public class DeliverServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DeliverServerApplication.class, args);
        //InternalResourceViewResolver bean = run.getBean(InternalResourceViewResolver.class);
    }
}
