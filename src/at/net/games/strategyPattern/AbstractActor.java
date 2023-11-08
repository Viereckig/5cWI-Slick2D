package at.net.games.strategyPattern;

import at.net.games.strategyPattern.move.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class AbstractActor implements Actor, Observer{
    protected MoveStrategy moveStrategy;

    public AbstractActor(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.moveStrategy.update(delta);
    }

}
