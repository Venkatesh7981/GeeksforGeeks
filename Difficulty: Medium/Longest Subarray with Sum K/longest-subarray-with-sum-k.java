import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        // Map to store (prefix_sum, first_index where it occurred)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int prefix_sum = 0;
        int maxLen = 0;
        int length = 0;

        for(int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];  // Update prefix sum

            // If sum from 0 to i is exactly k
            if(prefix_sum == k) {
                maxLen = i + 1;
            }

            // If there exists a previous prefix sum such that:
            // current_prefix - previous_prefix == k
            if(map.containsKey(prefix_sum - k)) {
                length = i - map.get(prefix_sum - k);
                maxLen = Math.max(maxLen, length);
            }

            // Store the prefix sum only if it is not already present
            // We want the earliest index for max length
            if(!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, i);
            }
        }

        return maxLen;
    }
}

