package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FairyWind extends SpecialMove {
    public FairyWind (){
        super(Type.FAIRY, 40.0, 100.0);
    }

    @Override
    protected String describe() {
        return "применяет Fairy Wind";
    }
}
