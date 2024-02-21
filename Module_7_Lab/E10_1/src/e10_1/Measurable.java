package e10_1;

public interface Measurable {
    double getMeasure();

    static Measurable largest(Measurable[] objects) {
        if (objects == null || objects.length == 0) return null;
        
        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }

    static Measurable smallest(Measurable[] objects) {
        if (objects == null || objects.length == 0) return null;

        Measurable smallest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() < smallest.getMeasure()) {
                smallest = obj;
            }
        }
        return smallest;
    }
}
