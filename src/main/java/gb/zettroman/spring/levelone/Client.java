package gb.zettroman.spring.levelone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AutoFireArm kalashnikovRifle = context.getBean("kalashnikovRifle", AutoFireArm.class);
        GunClip kalashnikovClip = context.getBean("kalashnikovClip", GunClip.class);

        kalashnikovClip.equip(5);
        // без следущей строки ловим NPE. Наверное следует использовать InnerBean,
        // но я пока не разобрался как это правильно сделать в моем случае.
        kalashnikovRifle.setGunClip(kalashnikovClip);
        kalashnikovRifle.shoot();
        kalashnikovRifle.shoot();
        kalashnikovRifle.autoshoot(5);
        kalashnikovRifle.getGunClip().equip(2);
        kalashnikovRifle.shoot();
        kalashnikovRifle.shoot();
        kalashnikovRifle.shoot();

    }
}
