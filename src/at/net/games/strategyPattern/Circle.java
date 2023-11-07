package at.net.games.strategyPattern;

import at.net.games.strategyPattern.move.MoveRight;
import at.net.games.strategyPattern.move.MoveStrategy;
import org.newdawn.slick.*;



public class Circle extends AbstractActor{

    public Circle(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 50,50);
    }

}

