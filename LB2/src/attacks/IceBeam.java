package attacks;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() < 0.1)
            Effect.freeze(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Ice Beam";
    }
}
