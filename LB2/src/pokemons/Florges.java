package pokemons;

import attacks.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Florges extends Floette{
    public Florges(String var1, int var2){
        super(var1, var2);
        setType(Type.FAIRY);
        setStats(78.0, 65.0, 68.0, 112.0, 154.0, 75.0);
        setMove(new Swagger());
    }
}
