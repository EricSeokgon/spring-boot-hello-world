package tk.hadeslee;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.h2.server.web.WebServlet;

/**
 * Project: spring-boot-hello-world
 * FileName: WebConfiguration
 * Date: 2016-01-20
 * Time: 오후 5:32
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class WebConfiguration {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
