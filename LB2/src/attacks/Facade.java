package attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status p = pokemon.getCondition();
        if(p == Status.POISON || p == Status.PARALYZE|| p == Status.BURN)
            pokemon.setMod(Stat.HP, 140);
    }

    @Override
    protected String describe() {
        return "применяет Facade";
    }
}
