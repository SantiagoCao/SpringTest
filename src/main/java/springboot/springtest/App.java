package springboot.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import javax.sql.DataSource;

import springboot.springtest.config.SwaggerConfiguration;

@SpringBootApplication
//@EnableJpaRepositories
@Import(SwaggerConfiguration.class)
public class App 
{
//    @Autowired
//    DataSource dataSource;
    
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
           registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");
    }  
    
//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//        return sessionFactory;
//    } 
}
