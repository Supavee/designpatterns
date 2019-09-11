package composite;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    public int checkDuck = 0;
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
        this.checkDuck = 1;
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            if (checkDuck==1) {
                quacker.quack();
                quacker.quack();
                checkDuck++;
            }

        }
    }
}
