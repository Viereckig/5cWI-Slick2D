package at.net.games.wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

import static at.net.games.wintergame.AllEnums.direction.LEFT;
import static at.net.games.wintergame.AllEnums.direction.RIGHT;
import static at.net.games.wintergame.AllEnums.direction.DOWN;
import static at.net.games.wintergame.AllEnums.direction.UP;

public class MyGame extends BasicGame{
    private List<Actor> actors = new ArrayList();

    public MyGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        actors.add(new CircleActor(0,100));
        actors.add(new CircleActor(0,300));
        actors.add(new OvalActor(500,500, LEFT));
        actors.add(new OvalActor(500,500, RIGHT));
        actors.add(new RectActor(500,0, DOWN));


    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gc,delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
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
