package ru.netology.danilagafonov.rest.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.danilagafonov.rest.repository.UserRepository;
import ru.netology.danilagafonov.rest.service.AuthorizationService;

@Configuration
public class JavaConfig {


    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService();
    }


    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
