package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"services", "repository"})
public class ProjectConfig {

//    @Bean(name = "B")
//    public MyBean myBean1(){
//        MyBean newMyBean = new MyBean();
//
//        newMyBean.setText("Hello Loc 1");
//
//        return newMyBean;
//    }
//
//    @Bean(name = "B")
//    public MyBean myBean2(){
//        MyBean newMyBean = new MyBean();
//
//        newMyBean.setText("Hello Loc 2");
//
//        return newMyBean;
//    }
}
