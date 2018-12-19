package pl.arek.springboothelloworld.hello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HelloServiceTest {
    private HelloService helloService;

    @Before
    public void setUp() throws Exception {
        helloService = new HelloService();
    }

    @Test
    public void Should_AssembleHelloString() {
        // given
        String name = "juzek";

        // when
        String result = helloService.sayHello(name);

        // then
        assertEquals("Hello, juzek!", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Should_ThrowException_When_NameIsNull() {
        // given
        // initialization

        // when
        helloService.sayHello(null);
    }
}
