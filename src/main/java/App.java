import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Первый привет миру: " + bean.getMessage());

        HelloWorld beanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Второй привет миру: " + beanSecond.getMessage());

        Cat catFirst =
                (Cat) applicationContext.getBean("cat");
        System.out.println("Первый кот сказал: " + catFirst.getCatMessage());
        Cat catSecond =
                (Cat) applicationContext.getBean("cat");
        System.out.println("Второй кот сказал: " + catSecond.getCatMessage());

        System.out.println("Равны ли объекты без @Scope: " + bean.equals(beanSecond));
        System.out.println("Равны ли объекты со @Scope: " + catFirst.equals(catSecond));


    }
}