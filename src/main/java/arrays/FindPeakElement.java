package arrays;

public class FindPeakElement {

    /**
     * Peak element: An element which is greater than its neighbourhoods.
     *
     * 1, 3, 20, 4, 1, 0
     * Here 20 is the answer because left of 20 is 3, and right of 20 is 4.
     * 20 > 3 and 20 > 4.
     *
     * For better time complexity we will use binary search.
     *
     * start = 0
     * end = 5
     * mid = 2
     * a[mid] > a[mid+1]; end = mid
     * 20 > 4; end = 2
     *
     * start = 0
     * end = 2
     * mid = 1
     *
     * 3 > 20; start = mid + 1
     *
     * start = 2
     * end = 2
     * mid = 1
     *
     * return 2 (index) a[2] = 20
     *
     * ------------------------------------------------------------------
     * 1, 2, 5, 7, 9, 11, 15, 14, 13, 12
     *
     * start = 0
     * end = 9
     * mid = 4
     * 9 > 11 ? start = mid + 1
     *
     * start = 5
     * end = 9
     * mid = 7
     * 14 > 13; end = 7
     *
     * start = 5
     * end = 7
     * mid = 6
     * 15 > 14 ; end = 6
     *
     * start = 5
     * end = 6
     * mid = 5
     * 11 > 15; start = 6
     *
     * start = 6
     * end = 6
     * mid = 6
     *
     * return 6 (index)
     *
     */
    /**
     *
     * @param arr
     * @return
     */

    public int solution(int[] arr){

        int startIndex = 0;
        int endIndex = arr.length -1;
        while(startIndex < endIndex)
        {
            int midIndex = (startIndex + endIndex) / 2;
            if(arr[midIndex] > arr[midIndex+1]){ // this may be a peak as the right of mid is smaller
                endIndex = midIndex;
                // you are in decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
            }
            else{
                startIndex = midIndex + 1;
            }
        }

        return startIndex;
    }
}