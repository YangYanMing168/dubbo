import com.szu.dao.DemoService;
import com.szu.service.SayHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by kamyang on 2017/10/31.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("application.xml");
        appContext.start();
        DemoService bean = appContext.getBean(DemoService.class);
        String hello = bean.sayHello("KamYang");
        System.out.println(hello);
        SayHelloService service = appContext.getBean(SayHelloService.class);
        service.sayHello("HHH");
        System.out.println("结束");
//        System.exit(0);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
