package configs;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"beans"})
public class ProjectConfig {
//    @Bean
//    public Cat cat(){
//        Cat cat = new Cat();
//
//        cat.setName("Bo Bo");
//
//        return cat;
//    }
//
//    @Bean
//    public Owner owner(){
//        Owner owner = new Owner();
//
//        owner.setCat(cat());
//
//        return owner;
//    }
}
