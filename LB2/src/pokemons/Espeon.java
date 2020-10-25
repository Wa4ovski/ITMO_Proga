package pokemons;

import attacks.Psybeam;
import ru.ifmo.se.pokemon.Type;

public class Espeon extends Eevee{
    public Espeon(String var1, int var2){
        super(var1, var2);
        setType(Type.PSYCHIC);
        setStats(65.0, 65.0, 60.0, 130.0, 95.0, 110.0);
        setMove(new Psybeam());
    }
}
