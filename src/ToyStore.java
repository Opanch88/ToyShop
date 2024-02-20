import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {
    private final PriorityQueue<Toy> toys;
    private Random random;

    public ToyStore() {
        this.toys = new PriorityQueue<>(new ToysComparator());
        this.random = new Random();
    }

    public void putToy(Toy toy) {
        for (int i = 0; i < toy.getFrequency(); i++) {
            toys.add(toy);
        }
    }

    public Toy getToy() {
        int randomIndex = random.nextInt(toys.size());
        int currentIndex = 0;

        for (Toy toy : toys) {
            if (currentIndex == randomIndex) {
                toys.remove(toy);
                return toy;
            }
            currentIndex++;
        }

        return null;
    }
}