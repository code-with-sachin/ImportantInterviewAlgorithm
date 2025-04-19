import java.util.Arrays;

public class PrefixSum {

    //Equilibrium point in Array
    //Count subarray with equal no of 0 and 1
    //Max common span in 2 binary subArray with equal no of 0 and 1
    //Array with 0 sum

    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, -2, -4, 3, 0};

        //int sum = 0;
        for (int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
        }
        //System.out.println(Arrays.toString(arr));

        System.out.println(equilibriumIndex(arr));
    }

    //equilibrium index
    private static int equilibriumIndex(int array[]) {
        int totalSum=0;
        int leftSum=0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        for (int i = 0; i< array.length; i++) {
            int rightSum = totalSum - (leftSum + array[i]);
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += array[i];
            }
        return -1;
    }
}
