class Solution {
    public int dominantIndex(int[] arr) {
        
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondlargest && largest != arr[i]) {
                secondlargest = arr[i];
            }
        }

        if (largest >= (secondlargest * 2)) {
            return index;
        }
        return -1;

    }
}