package pl.arek.springboothelloworld.user;

import org.junit.Test;
import pl.arek.springboothelloworld.user.User;

public class UserDemo {
    @Test
    public void Should_DemonstrateLombok() {
        User user = new User();

        user.setAge(13);
        user.setName("Christiane");
        user.setSex(true);

        System.out.println(user.toString());
    }
}
