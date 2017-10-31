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
        System.out.println("初始化结束");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
