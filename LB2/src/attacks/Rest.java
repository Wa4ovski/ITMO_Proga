package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0.0, 0.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -((int)pokemon.getStat(Stat.HP) - (int)pokemon.getHP()));
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.setCondition(e);
    }
    @Override
    protected String describe() {
        return "применяет Rest";
    }
}
