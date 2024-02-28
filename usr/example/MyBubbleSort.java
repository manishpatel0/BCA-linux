class MyBubbleSort {

	static void sort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < i-1; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		int[] arr = {11,2,4,24,3, 8,6,9};

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sort(arr);
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}