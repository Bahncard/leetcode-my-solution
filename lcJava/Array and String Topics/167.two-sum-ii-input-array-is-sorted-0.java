/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //sorted array->binary search
        //for each element in the array, calculate the complement, binary search for the complement in the folowing subaaray
        for(int i=0; i< numbers.length; i++){
            //initilize the pointers:binary search from the next element in the array
            int low= i+1; 
            int high= numbers.length-1;
            //start search
            while(low <= high){
                int mid= low + (high-low)/2;
                //search for delta
                if( numbers[mid] == target-numbers[i] ){
                    return new int[]{i+1, mid+1};
                }else if(numbers[mid] > target-numbers[i]){
                    high = mid-1;
                }else{
                    low=mid+1;
                }
            }
    }
    return new int[]{-1,-1};
        }
}
//一般对于sorted array，常见解法有binary search，two pointers 
//这里用binary search

// @lc code=end

