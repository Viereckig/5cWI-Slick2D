package at.net.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor{

    private int x,y;
    private AllEnums.direction dir;

    public OvalActor (int x, int y, AllEnums.direction dir) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        switch (this.dir) {
            case UP:
                this.y--;
                break;
            case DOWN:
                this.y++;
                break;
            case LEFT:
                this.x--;
                break;
            case RIGHT:
                this.x++;
                break;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,50);
    }
}
