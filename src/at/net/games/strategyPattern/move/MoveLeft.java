package at.net.games.strategyPattern.move;

public class MoveLeft implements MoveStrategy{
    private float x, y, speed;

    public MoveLeft(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta) {
        this.x -= delta * speed;
        if (this.x < 0) {
            this.x = 700;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
