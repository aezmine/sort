
/**
 * GITHUB   :          https://github.com/aezmine
 * @author  :           AZMIN
 */

public class BubbleSort{
    public static void main(String[] args) {
        
        int[] n1 = {10,9,8,2,4,65}; // gonna sort in ascending
        int[] n2 = {10,9,8,2,4,65}; // sort in descending
        
        System.out.println("Before Sort:(Data 1)");
        for(int i : n1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Before Sort(Data 2):");
        for(int i : n2){
            System.out.print(i + " ");
        }
        System.out.println();
        
        ascending(n1);
        descending(n2);
        
        System.out.println("After Sort:(Data 1)");
        for(int i : n1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After Sort(Data 2):");
        for(int i : n2){
            System.out.print(i + " ");
        }
        
    }
    // method to sort in ascending
    static void ascending(int[] nums){
        int temp;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    // method to sort in descending
    static void descending(int[] nums){
        int temp;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] < nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
