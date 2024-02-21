package e10_7;

public class Data {
    
    public static Object largest(Object[] objects, Measurer m) {
        if (objects == null || objects.length == 0) return null;

        Object largestObject = objects[0];
        double largestMeasure = m.measure(largestObject);
        
        for (Object obj : objects) {
            double measure = m.measure(obj);
            if (measure > largestMeasure) {
                largestMeasure = measure;
                largestObject = obj;
            }
        }
        return largestObject;
    }
    
    public static double average(Object[] objects, Measurer m) {
        if (objects == null || objects.length == 0) return 0;

        double sum = 0;
        for (Object obj : objects) {
            sum += m.measure(obj);
        }
        return sum / objects.length;
    }
    
    public static Object smallest(Object[] objects, Measurer m) {
        if (objects == null || objects.length == 0) return null;

        Object smallestObject = objects[0];
        double smallestMeasure = m.measure(smallestObject);
        
        for (Object obj : objects) {
            double measure = m.measure(obj);
            if (measure < smallestMeasure) {
                smallestMeasure = measure;
                smallestObject = obj;
            }
        }
        return smallestObject;
    }
    
}
