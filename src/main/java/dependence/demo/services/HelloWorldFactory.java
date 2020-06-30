package dependence.demo.services;

public class HelloWorldFactory {

    public HelloWorldServices helloWorldServices(String language){
        HelloWorldServices services = null;
        switch (language){
            case "en":
                services = new HelloWorldServiceEnglish();
                break;
            case "pl":
                services = new HelloWorldServicePolish();
                break;
            case "de":
                services = new HelloWorldServiceGermany();
                break;
            case "ru":
                services = new HelloWorldServiceRussian();
                break;
            default:
                new HelloWorldServicePolish();
        }
        return services;
    }
}
