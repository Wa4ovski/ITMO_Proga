package pokemons;

import attacks.FairyWind;
import ru.ifmo.se.pokemon.Type;

public class Floette extends Flabebe{
    public Floette (String var1, int var2){
        super(var1, var2);
        setType(Type.FAIRY);
        setStats(54.0, 45.0, 47.0, 75.0, 98.0, 52.0);
        setMove(new FairyWind());
    }
}
