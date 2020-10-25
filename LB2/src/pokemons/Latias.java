package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Latias extends Pokemon {
    public Latias (String var1, int var2) {
        super(var1, var2);
        setType(Type.DRAGON, Type.PSYCHIC);
        setStats(80.0, 80.0, 90.0, 110.0, 130.0, 110.0);
        setMove(new DragonClaw(), new ShadowClaw(), new Facade(), new IceBeam());
    }
}
