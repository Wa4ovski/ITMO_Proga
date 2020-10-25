package attacks;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends SpecialMove {
    public SandAttack(){
        super(Type.GROUND, 0.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "прменяет Sand Attack";
    }
}
