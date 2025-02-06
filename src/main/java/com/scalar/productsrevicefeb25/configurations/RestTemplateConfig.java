package com.scalar.productsrevicefeb25.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    //create a bean for RestTemplate to call services
     @Bean
     public RestTemplate restTemplate() {
         return new RestTemplate();
     }

}
