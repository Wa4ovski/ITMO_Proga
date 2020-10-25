package attacks;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends PhysicalMove {
    public Psybeam(){
        super(Type.PSYCHIC, 65.0, 100.0);
    }
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() < 0.1)
            Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Psybeam";
    }
}
