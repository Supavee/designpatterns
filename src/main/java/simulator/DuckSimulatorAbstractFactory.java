package simulator;

import abstractfactory.AbstractDuckFactory;
import abstractfactory.CountingDuckFactory;
import abstractfactory.EchoingDuckFactory;
import adapter.GooseAdapter;
import composite.Flock;
import decorator.QuackCounter;
import decorator.QuackEcho;
import goose.Goose;
import quack.Quackable;

public class DuckSimulatorAbstractFactory {
    public static void main(String[] args) {
        DuckSimulatorAbstractFactory simulator = new DuckSimulatorAbstractFactory();
        AbstractDuckFactory duckFactoryC = new CountingDuckFactory();
        AbstractDuckFactory duckFactoryE = new EchoingDuckFactory();
        simulator.simulateCount(duckFactoryC);
        simulator.simulateEcho(duckFactoryE);
    }
    //         Abstract Factory Pattern
    void simulateCount(AbstractDuckFactory duckFactory) {
        Quackable mallardDuckAbsC = duckFactory.createMallardDuck();
        Quackable redheadDuckAbsC = duckFactory.createRedheadDuck();
        Quackable duckCallAbsC = duckFactory.createDuckCall();
        Quackable rubberDuckAbsC = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuckAbsC);
        simulate(redheadDuckAbsC);
        simulate(duckCallAbsC);
        simulate(rubberDuckAbsC);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() +" times");
    }
    void simulateEcho(AbstractDuckFactory duckFactory) {
        Quackable mallardDuckAbsE = duckFactory.createMallardDuck();
        Quackable redheadDuckAbsE = duckFactory.createRedheadDuck();
        Quackable duckCallAbsE = duckFactory.createDuckCall();
        Quackable rubberDuckAbsE = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuckAbsE);
        simulate(redheadDuckAbsE);
        simulate(duckCallAbsE);
        simulate(rubberDuckAbsE);
        simulate(gooseDuck);

        System.out.println("The ducks quacked echo " +
                QuackEcho.getEcho() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
