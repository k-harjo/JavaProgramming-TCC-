package e10_3;

public class Data {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return objects.length > 0 ? sum / objects.length : 0;
    }

    public static Measurable largest(Measurable[] objects) {
        if (objects == null || objects.length == 0) return null;

        Measurable largest = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }
}
