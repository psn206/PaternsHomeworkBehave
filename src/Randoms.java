import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    public Random randoms;
    private int max;
    private int min;

    public Randoms(int min, int max) {
        this.max = max + 1;
        this.min = min;
        this.randoms = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return randoms.nextInt(max - min) + min;
            }
        };
    }
}
