package attacks;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    public Tackle(){
        super(Type.NORMAL, 40.0, 100.0);
    }

    @Override
    protected String describe() {
        return "применяет Tackle";
    }
}
