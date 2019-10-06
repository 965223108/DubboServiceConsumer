import com.beans.Address;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ApplicationMain {
    public static void main(String[] args)
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        UserService userService = ioc.getBean(UserService.class);
        List<Address> address = userService.getAddress(1);
        System.out.print(address);
    }
}
