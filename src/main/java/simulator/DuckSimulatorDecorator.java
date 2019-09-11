package simulator;

import abstractfactory.AbstractDuckFactory;
import abstractfactory.CountingDuckFactory;
import adapter.GooseAdapter;
import adapter.PigeonAdapter;
import composite.Flock;
import decorator.QuackCounter;
import decorator.QuackEcho;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import goose.Goose;
import pigeon.Pigeon;
import quack.Quackable;

public class DuckSimulatorDecorator {
    public static void main(String[] args) {
        DuckSimulatorDecorator simulator = new DuckSimulatorDecorator();
        simulator.simulate();

    }
    void simulate() {

        // Decorator Pattern
        Quackable mallardDuckDec = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuckDec = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCallDec = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuckDec = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuckDec = new GooseAdapter(new Goose());
        Quackable pigeonCallDec = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuckDec);
        simulate(redheadDuckDec);
        simulate(duckCallDec);
        simulate(rubberDuckDec);
        simulate(gooseDuckDec);
        simulate(pigeonCallDec);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
        System.out.println("The ducks quacked echo " +
                QuackEcho.getEcho() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
