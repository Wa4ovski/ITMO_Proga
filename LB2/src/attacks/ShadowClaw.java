package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(){
        super(Type.GHOST, 70.0, 100.0);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if(Math.random() < 1.0/8.0)
            return 2.0;
        return 1.0;
    }

    @Override
    protected String describe() {
        return "применяет Shadow Claw";
    }
}
