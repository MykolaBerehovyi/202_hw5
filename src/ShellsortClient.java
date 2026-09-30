public class ShellsortClient {
    public static void main(String[] args) {
        String[] a = {
            "S", "H", "E", "L", "L", "S", "O",
            "R", "T", "R", "O", "C", "K", "S"
        };

        System.out.println("Before:");
        print(a);

        Shellsort.sort(a);

        System.out.println("After:");
        print(a);
    }

    private static void print(String[] a) {
        for (String item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
