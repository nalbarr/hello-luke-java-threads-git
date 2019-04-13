package pokemon;

import java.util.Random;

public abstract class BasePokemon implements IPokemon, Runnable {
    private String _name;
    private int _health;
    private int _speed;
    private Thread _thread;

    public BasePokemon(String name, int health, int speed) {
        _name = name;
        _health = health;
        _speed = speed;
        _thread = new Thread(this, name);
        System.out.println("New thread: " + _thread);
        _thread.start();
    }

    public void setName(String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }

    public void setHealth(int health) {
        _health = health;
    }
    public int getHealth() {
        return _health;
    }
    public boolean isDead() {
        return (_health <= 0) ? true : false;
    }

    public void run() {
        try {
            Random r = new Random();
            
            // run
            int count = r.nextInt(10) + 1;
            for (int i = 0; i < count; i++ ) {
		System.out.println(_name + ": " + i);
                Thread.sleep(1000 / _speed);
            }
	    
	    // fight

	    // eat
	    
        } catch (InterruptedException e) {
            System.out.println(_name + " interrupted.");
        }
        System.out.println(_name + " exiting."); 
    }
}
