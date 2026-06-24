import java.util.Scanner;

public class Solution {

  
    // Method to solve two sum
   public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] { i, j };
            }
        }
    }
    return null;
    }
}


//     // Main method
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array size
        
//         int n = sc.nextInt();

//         // Input array elements
//         int[] nums = new int[n];
        
//         for(int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         // Input target
        
//         int target = sc.nextInt();

//         // Call the method
//         TwoSum obj = new TwoSum();
//         int[] result = obj.twoSum(nums, target);

//         // Output
//         if (result.length == 2) {
//             System.out.println("Indices: " + result[0] + ", " + result[1]);
//         } else {
//             System.out.println("No solution found.");
//         }

//         sc.close();
//     }
// }



