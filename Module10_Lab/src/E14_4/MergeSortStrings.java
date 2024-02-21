package E14_4;

public class MergeSortStrings {

    public static void main(String[] args) {
        String[] array = {"banana", "apple", "cherry", "date", "grape", "kiwi", "mango"};
        mergeSort(array);
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void mergeSort(String[] array) {
        if (array.length <= 1) {
            return;
        }
        String[] first = new String[array.length / 2];
        String[] second = new String[array.length - first.length];
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);
        mergeSort(first);
        mergeSort(second);
        merge(first, second, array);
    }

    private static void merge(String[] first, String[] second, String[] array) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                array[j] = first[iFirst];
                iFirst++;
            } else {
                array[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, array, j, first.length - iFirst);
        System.arraycopy(second, iSecond, array, j, second.length - iSecond);
    }
}
