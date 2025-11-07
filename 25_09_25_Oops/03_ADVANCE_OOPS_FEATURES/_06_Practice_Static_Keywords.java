import java.util.*;

class Counter {

    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void resetCount() {
        count = 0;
    }
}

public class _06_Practice_Static_Keywords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of objects to be created for a class");

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            new Counter();
        }

        System.out.println("Number of objects created : " + Counter.getCount());
        Counter.resetCount();
        System.out.println("Number of objects after resetCount : " + Counter.getCount());
    }

}
