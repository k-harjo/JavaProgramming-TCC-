package e10_5;

public class SquareSequence implements Sequence {
    private int n = 0;

    public int next() {
        n++;
        return n * n;
    }
}

