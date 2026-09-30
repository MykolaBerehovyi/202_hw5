public class Shellsort {
    private static final int[] INCREMENTS = {
        1, 4, 13, 40, 121, 364, 1093, 3280,
        9841, 29524, 88573, 265720, 797161
    };

    public static void sort(Comparable[] a) {
        int n = a.length;

        int k = 0;
        while (k + 1 < INCREMENTS.length && INCREMENTS[k] < n / 3) {
            k++;
        }

        for (; k >= 0; k--) {
            int h = INCREMENTS[k];

            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
