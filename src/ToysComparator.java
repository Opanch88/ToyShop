import java.util.Comparator;

public class ToysComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getFrequency() - o2.getFrequency();
    }
}