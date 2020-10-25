package pokemons;

import attacks.EnergyBall;
import attacks.Rest;
import ru.ifmo.se.pokemon.*;

public class Flabebe extends Pokemon {
    public Flabebe (String var1, int var2){
        super(var1, var2);
        setType(Type.FAIRY);
        setStats(44.0, 38.0, 39.0, 61.0, 79.0, 42.0);
        setMove(new EnergyBall(), new Rest());
    }
}
