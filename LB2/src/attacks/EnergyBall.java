package attacks;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall (){
        super(Type.GRASS, 90.0, 100.0);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() < 0.1)
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "применяет Energy Ball";
    }
}
