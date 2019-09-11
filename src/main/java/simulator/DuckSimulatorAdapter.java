package simulator;

import pigeon.Pigeon;
import adapter.GooseAdapter;
import adapter.PigeonAdapter;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import goose.Goose;
import quack.Quackable;

public class DuckSimulatorAdapter {
    public static void main(String[] args) {
        DuckSimulatorAdapter simulator = new DuckSimulatorAdapter();
        simulator.simulate();

    }
    void simulate() {
        // Adapter Pattern
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonCall = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Goose Adapter");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonCall);

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
