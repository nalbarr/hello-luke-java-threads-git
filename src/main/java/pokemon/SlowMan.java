package pokemon;

import java.util.Queue;
import java.util.Random;

public class SlowMan extends BasePokemon {

    public SlowMan(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void eat(int bites, Queue foodStream) {
        for (int i = 0; i < bites; i++) {
            foodStream.remove();
        }
    }

    public void attack(IPokemon opponent) {
        Random r = new Random();
        opponent.defend(r.nextInt(10) + 1);
    }

    public void defend(int damage) {
        int adjustedDamage = damage * 2;
        setHealth(getHealth() - adjustedDamage);
    }
}