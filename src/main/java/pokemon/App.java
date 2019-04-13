package pokemon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class App {
    private static final int MAX_FOOD_SIZE = 1000000;
    private static Queue<Integer> _foodStream = new LinkedList<>();

    private void start() {
        createFoodStream(MAX_FOOD_SIZE);

        new SlowMan("Slow Man 1", 100, 1);
        new SlowMan("Slow Man 2", 100, 1);
        new FastBear("Fast Bear 1", 100, 2);
    }

    private void createFoodStream(int size) {
        Random r = new Random();
        for (int i = 0; i < MAX_FOOD_SIZE; i++) {
            Integer value = new Integer(r.nextInt(10 + 1));
            _foodStream.add(value);
        }
    }

    public static void main(String[] args) {
        new App().start();
    }
}
