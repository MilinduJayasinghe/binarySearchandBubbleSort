
package search;

public class Search {

    
      public void printing(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public void sorting(int[] arr) {
            int n = arr.length;
            boolean isSwapped;

            for(int i = 0; i < n - 1; i++) {
                isSwapped = false;
                for(int x = 0; x < n - 1 - i; x++) {
                    if(arr[x] > arr[x + 1]) {
                        int temp = arr[x];
                        arr[x] = arr[x + 1];
                        arr[x + 1] = temp;
                        isSwapped = true;
                    }
                }
                if(isSwapped == false) {
                    break;
                }

            }

        }
    
    public int search(int[] nums, int target){
       
        if (nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length-1;
        
        while (left <= right){
            int midpoint = left + (right-left)/2;
            if (nums[midpoint] == target) {
                 return midpoint;
                 
            }else if (nums[midpoint] > target) {
                right = midpoint - 1;
                
            }else{
                left = midpoint +1;
            }
        }
        
        
       return -1; 
    }
    
    public static void main(String[] args) {
        
        int[] nums = {30, 01, 63, 56, 70, 90, 74, 76, 10, 120};
       
        Search ss = new Search();
        System.out.println("Array Before sorting :");
        ss.printing(nums);
        ss.sorting(nums);
        System.out.println("Array after sorting :");
        ss.printing(nums);
        System.out.println("Index :");
        System.out.println(ss.search(nums, 70));
        
        

    }
    
}
