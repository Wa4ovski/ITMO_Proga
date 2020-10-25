package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Eevee extends Pokemon {
    public Eevee(String var1, int var2) {
        super(var1, var2);
        setType(Type.NORMAL);
        setStats(55.0, 55.0, 50.0, 45.0, 65.0, 55.0);
        setMove(new SandAttack(), new Tackle(), new Swagger());
    }

}
