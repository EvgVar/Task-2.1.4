package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal cat;
    private Animal dog;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal cat, @Qualifier("dog") Animal dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
