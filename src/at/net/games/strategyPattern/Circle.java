package at.net.games.strategyPattern;

import at.net.games.strategyPattern.move.MoveRight;
import at.net.games.strategyPattern.move.MoveStrategy;
import org.newdawn.slick.*;



public class Circle implements Actor{

    private MoveStrategy moveStrategy;

    public Circle(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 50,50);
    }

}

