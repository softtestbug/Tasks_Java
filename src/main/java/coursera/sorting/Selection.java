package coursera.sorting;

public class Selection {

    static int exch = 0;
    static int comp = 0;

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            if (i != min) {
                exch(a, i, min);
            }
        }
    }

    private static boolean isSorted(Comparable[] a, int min) {
        for (int i = 0; i < min; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    private static boolean less(Comparable comparable, Comparable min) {
        comp++;
        return comparable.compareTo(min) < 0;

    }

    private static void exch(Comparable[] a, int i, int j) {
        exch++;
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,};

        Integer[] arr2 = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,
                10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2,
                6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5, 10, 9, 8, 7, 6, 5, 4
                , 3, 2, 2, 6, 5, 4, 3, 2, 2, 8, 7, 6, 5, 4, 3, 2, 2, 6, 5,};


        long start = System.currentTimeMillis();
        sort(arr1);
        System.out.println(System.currentTimeMillis() - start);

        Insertion insertion = new Insertion();

        start = System.currentTimeMillis();
        insertion.sortX(arr2);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("s exch " + exch);
        System.out.println("s comp = " + comp);

        System.out.println("i exch " + insertion.exch);
        System.out.println("i comp = " + insertion.comp);


//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
    }
}
