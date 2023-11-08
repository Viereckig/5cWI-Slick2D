package at.net.games.strategyPattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractActor{

    private float x, y, speed;
    private List<Circle> circles;

    public Player() {
        super(null);
        this.x = 300;
        this.y = 300;
        this.speed = 1f;
        this.circles = new ArrayList<>();
    }

    public void addActor(Circle circle){
        this.circles.add(circle);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if (gc.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= this.speed * delta;
        }
        if (gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += this.speed * delta;
        }
        if (this.x > 700) {
            for (Circle circle : this.circles) {
                circle.inform();
            }
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x, this.y, 50,50);
    }

    @Override
    public void inform() {

    }
}
