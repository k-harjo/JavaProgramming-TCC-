package e17_8;

public class SumVisitor implements Visitor {
    private long sum = 0;
    private int count = 0;

    public void visit(Comparable data) {
        if (data instanceof Integer) {
            sum += (Integer) data;
            count++;
        }
    }

    public double getAverage() {
        return count == 0 ? 0 : (double) sum / count;
    }
}