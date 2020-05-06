package oauth2rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;

@EnableOAuth2Client
@SpringBootApplication
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

//    @Bean
//    ClientRegistrationRepository clientRegistrationRepository() {
//        return new InMemoryClientRegistrationRepository();
//    }

    @Bean
    RestTemplate restTemplate(OAuth2ProtectedResourceDetails oauth2RemoteResource) {
        return new OAuth2RestTemplate(oauth2RemoteResource);
    }
}
