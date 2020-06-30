package dependence.demo.config;

import dependence.demo.services.HelloWorldFactory;
import dependence.demo.services.HelloWorldServiceEnglish;
import dependence.demo.services.HelloWorldServicePolish;
import dependence.demo.services.HelloWorldServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldServices helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.helloWorldServices("en");
    }
    @Bean
    @Profile("polish")
    public HelloWorldServices helloWorldServicesPolish(HelloWorldFactory factory){
        return factory.helloWorldServices("pl");
    }
    @Bean
    @Profile("germany")
    public HelloWorldServices helloWorldServicesGermany(HelloWorldFactory factory){
        return factory.helloWorldServices("de");
    }
    @Bean
    @Profile("russian")
    public HelloWorldServices helloWorldServicesRussian(HelloWorldFactory factory){
        return factory.helloWorldServices("ru");
    }


}
