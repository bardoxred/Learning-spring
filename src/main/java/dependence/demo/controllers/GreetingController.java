package dependence.demo.controllers;

import dependence.demo.services.HelloWorldServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private HelloWorldServices helloWorldServices;

    @Autowired
    public GreetingController(HelloWorldServices helloWorldServices) {
        this.helloWorldServices = helloWorldServices;
    }

    public String sayHello(){
        String greeting = helloWorldServices.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}
