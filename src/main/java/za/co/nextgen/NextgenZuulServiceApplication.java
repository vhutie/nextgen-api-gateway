package za.co.nextgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NextgenZuulServiceApplication {
   public static void main(String[] args) {
      SpringApplication.run(NextgenZuulServiceApplication.class, args);
   }
   
   @Bean
   public SimpleFilter simpleFilter() {
     return new SimpleFilter();
   }
}
