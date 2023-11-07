package at.net.games.strategyPattern;

import at.net.games.strategyPattern.move.MoveLeft;
import at.net.games.strategyPattern.move.MoveRight;
import at.net.games.strategyPattern.move.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;

public class MyGame extends BasicGame {
    private ArrayList<Actor> actors;
    public MyGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        MoveStrategy ms1 = new MoveRight(0,0,0.3f);
        MoveStrategy ms2 = new MoveLeft(300,0,0.1f);

        Circle c1 = new Circle(ms1);
        Circle c2 = new Circle(ms2);

        this.actors.add(c1);
        this.actors.add(c2);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer, i);
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