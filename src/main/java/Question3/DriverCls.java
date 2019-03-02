package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverCls {

    public static  void main (String [] args){
        //Question 3
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung = factory.getBean(Samsung.class);
        samsung.simcard();
        samsung.camera();
        samsung.config();


        Nokia nokia = factory.getBean(Nokia.class);
        nokia.simcard();
        nokia.camera();
        nokia.config();
    }
}
