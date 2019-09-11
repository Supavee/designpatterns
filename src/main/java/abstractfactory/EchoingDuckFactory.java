package abstractfactory;

import decorator.QuackEcho;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import quack.Quackable;

public class EchoingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackEcho(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new QuackEcho(new RedheadDuck());
    }
    public Quackable createDuckCall() {
        return new QuackEcho(new DuckCall());
    }
    public Quackable createRubberDuck() {
        return new QuackEcho(new RubberDuck());
    }
}
