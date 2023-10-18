package at.net.games.wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MyGame extends BasicGame{
    private List<CircleActor> circles = new ArrayList();

    public MyGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        circles.add(new CircleActor(0,100));
        circles.add(new CircleActor(0,300));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (CircleActor circle : this.circles) {
            circle.update(gc,delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (CircleActor circle : this.circles) {
            circle.render(graphics);
        }
    }

    public static void main(String[] args) {
        try {
            AppGameContainer container = new AppGameContainer(new MyGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
