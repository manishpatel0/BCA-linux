
class MyBinarySearching { 

	public static int bsearching(int[] arr, int p){
        int left = 0;
        int right = arr.length - 1;

        // while the search space has at least one element
        while (left <= right) {

            // half the search space
            int mid = (left + right) / 2;

            // if domain overflow can happen then use:
            // int mid = left + (right - left) / 2;
            // int mid = right - (right - left) / 2;
            
            // we found the searched element 
            if (p == arr[mid]) {
                return mid;
            } // discard all elements in the right of the search space including 'mid'
            else if (p < arr[mid]) {
                right = mid - 1;
            } // discard all elements in the left of the search space including 'mid'
            else {
                left = mid + 1;
            }
        }

        // by convention, -1 means element not found into the array
        return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,45,5,6,7,0};
		int r = bsearching(arr,7);
		System.out.print(" result is : " + r);
		
	}

}
