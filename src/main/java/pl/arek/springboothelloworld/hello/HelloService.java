package pl.arek.springboothelloworld.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(String name) {
        if (name == null) throw new IllegalArgumentException();
        return "Hello, " + name + "!";
    }

}
