import java.util.*;
class Task04 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("N= ");
        int a = s.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;

            } else {
                arr[i] = 0;
            }
        }
        System.out.println("After modifying: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
