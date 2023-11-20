import java.util.Arrays;

class Que_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 2, 5, 4, 7, 8, 10, 9, 11};
        int x = missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing No is "+ x);
    }
   static public int missingNumber(int[] nums) {
       int i = 0;
       while (i < nums.length) {
           int correct = nums[i];
           if (nums[i] < nums.length && nums[i] != nums[correct]) {
               swap(i, correct, nums);
           } else {
               i++;
           }
       }

       for (int index = 0; index < nums.length; index++) {
           if (nums[index] != index) {
               return index;
           }
       }
       return nums.length;
   }
    static void swap(int a, int b, int [] nums){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}