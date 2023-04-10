package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"repositories"})
public class ProjectConfig {
    @Bean
    public DataSource dataSource(){
        var driverManagerDataSource  = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost/spring-learn");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");

        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
}
