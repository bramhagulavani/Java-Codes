import java.util.*;

public class Adder {
    int[] array;
    int targetSum;

    public Adder() {
        this.array = new int[0];
        this.targetSum = 0;
    }

    public void getData(int[] arr, int target) {
        this.array = arr;
        this.targetSum = target;
    }

    public int[] numSum() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adder adder = new Adder();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " distinct integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        adder.getData(arr, target);
        int[] result = adder.numSum();

        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println(" No pair found.");
        }

        sc.close();
    }
}
