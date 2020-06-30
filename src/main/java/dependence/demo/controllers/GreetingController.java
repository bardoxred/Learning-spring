package dependence.demo.controllers;

import dependence.demo.services.HelloWorldServiceEnglish;
import dependence.demo.services.HelloWorldServicePolish;
import dependence.demo.services.HelloWorldServices;

    public class GreetingController {
        private HelloWorldServices helloWorldServices;
        private HelloWorldServices helloWorldServicesPolish;
        private HelloWorldServices helloWorldServicesEnglish;
        private HelloWorldServices helloWorldServicesGerman;

        public GreetingController(HelloWorldServices helloWorldServices) {
        this.helloWorldServices = helloWorldServices;
        }
        public void setHelloWorldServiceEnglish(HelloWorldServices helloWorldServiceEnglish){
            this.helloWorldServicesEnglish = helloWorldServiceEnglish;
        }
        public void setHelloWorldServicePolish(HelloWorldServices helloWorldServicePolish) {
            this.helloWorldServicesPolish = helloWorldServicePolish;
        }
        public void setHelloWorldServiceGerman(HelloWorldServices helloWorldServiceGerman) {
            this.helloWorldServicesGerman = helloWorldServiceGerman;
        }

        public String sayHello(){
            String greeting = helloWorldServices.getGreeting();
            System.out.println(greeting);
            System.out.println(helloWorldServicesPolish.getGreeting());
            System.out.println(helloWorldServicesEnglish.getGreeting());
            System.out.println(helloWorldServicesGerman.getGreeting());
            return greeting;
        }


    }
