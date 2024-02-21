package p19_1;

public class InterpolationSearch {

    public static int interpolationSearch(int[] array, int valueToFind) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        int delta;

        while (array[low] <= valueToFind && array[high] >= valueToFind) {
            if (low == high) {
                if (array[low] == valueToFind) return low;
                return -1;
            }

            delta = (valueToFind - array[low]) / (array[high] - array[low]);
            mid = low + ((high - low) * delta);

            if (array[mid] == valueToFind) {
                return mid;
            } else if (array[mid] < valueToFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        
        int[] uniformArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int[] nonUniformArray = {1, 3, 6, 6, 7, 10, 14, 14, 17, 20}; 

        int valueToFind = 7;
        System.out.println("Interpolation Search (Uniform Array): Index of " + valueToFind + " is " + interpolationSearch(uniformArray, valueToFind));
        System.out.println("Interpolation Search (Non-Uniform Array): Index of " + valueToFind + " is " + interpolationSearch(nonUniformArray, valueToFind));
    }
}
