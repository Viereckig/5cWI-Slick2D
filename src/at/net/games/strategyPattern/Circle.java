package at.net.games.strategyPattern;

import at.net.games.strategyPattern.move.MoveRight;
import at.net.games.strategyPattern.move.MoveStrategy;
import org.newdawn.slick.*;



public class Circle extends AbstractActor implements Observer{
    private Color color;


    public Circle(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 50,50);
        graphics.setColor(Color.white);
    }

    public void inform(){

        if(color == Color.red) {
            this.color = Color.green;
        }else{
            this.color = Color.red;
        }
    }

}

