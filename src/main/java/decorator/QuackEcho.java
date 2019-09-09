package decorator;

import quack.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;
    static int numberOfEcho;
    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        numberOfEcho++;
    }
    public static int getEcho() {
        return numberOfEcho;
    }
}