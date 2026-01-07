package ArrayList;

public class PairSum1 {
    public static boolean pairSum(int[] arr, int target){
        int leftP = 0;
        int rightP = arr.length-1;
        while(leftP != rightP){
            if(arr[leftP] + arr[rightP] == target){
                return true;
            }
            if(arr[leftP] + arr[rightP] < target){
                leftP++;
            }
            if(arr[leftP] + arr[rightP] > target){
                rightP++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 20;
        System.out.println(pairSum(arr, target));
    }
}
