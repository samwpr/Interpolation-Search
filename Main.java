
/**************************************************
INTERPOLATION SEARCH 

Time Complexity 
Average case: O(log(log(n)))
Worst case: O(n) if dataset increases exponentially
*/

class Main {
  public static void main(String[] args) {

		//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
		
		int index = interpolationSearch(array, 256);

		if(index != -1){
			System.out.println("Found at index:" + index);
		} else 
			System.out.println("Not Found");
		}

	private static int interpolationSearch(int[] array, int target){

		int low = 0;
		int high = array.length - 1; 

		while(target >= array[low] && target <= array[high] && low <=high){
			int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

			System.out.println("probe: " + probe);

			if(array[probe] == target){
				return probe;
			} else if (array[probe] < target){
				low = probe +1;
			} else {
				high = probe -1; 
			}
		}
		return -1;
	}
}

/**************************************************
Working 

Array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
Array Length = 11 

Target = 256

low = 0;

high = 10

while(target >= array[low] && target <= array[high] && low <=high)

256 >= 1 && 256 <= 1024 && 0 <= high


	int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

	0 + (10 - 0) * (256 - 1) / (1024 - 1) = 2.49 = 2 

	PROBE = 2 

			if(array[probe] == target){
			if(2 == 256)
				return probe;

			else if (array[probe] < target)
			else if (2 < 256)
				low = probe +1;
				low = 2 + 1
				low = 3

			else 
				high = probe -1; 
				high = 2 - 1; 

In this case ELSE IF statement is selected 

Low is now = 3 

while(target >= array[low] && target <= array[high] && low <=high)

256 >= 8 && 256 <= 1024 && 3 <= 10 

int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

3 + (10 - 3) * (256 - 8) / (1024 - 8) = 4.7 = 4 

PROBE = 4 

			if(array[probe] == target){
				return probe;
			} else if (array[probe] < target){
				low = probe +1;
			} else {
				high = probe -1; 

If(16 == 256)

else if (16 < 256)

else if is selected 

low = probe + 1 

low = 4 + 1 

low is now 5 

while(target >= array[low] && target <= array[high] && low <=high)

256 >= 32 && 256 <= 1024 && 5 <= 10 

int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

5 + (10 - 5) * (256 - 32) / (1024 - 32) = 6.1 = 6 

PROBE = 6 
 {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

			if(array[probe] == target){
				return probe;
			} else if (array[probe] < target){
				low = probe +1;
			} else {
				high = probe -1; 

if 64 == 256 

else if 64 < target 

low = probe + 1 

low = 7 

while(target >= array[low] && target <= array[high] && low <=high)

256 >= 128 && 256 <= 1024 && 7 <= 10 

int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

7 + (10 - 7) * (256 - 128) / (1024 - 128) = 7.4 = 7 

PROBE = 7 
 {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

			if(array[probe] == target){
				return probe;
			} else if (array[probe] < target){
				low = probe +1;
			} else {
				high = probe -1; 

If 128 == 256 

else if 128 < 256 

low = probe + 1 
low = 8 

while(target >= array[low] && target <= array[high] && low <=high)

256 >= 256 && t256 <= 1024 && 8 <= 1024 

int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

8 + (10 - 8) * (256 - 256) / (1024 - 256) = 8 

PROBE = 8 

 {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

			if(array[probe] == target){
				return probe;
			} else if (array[probe] < target){
				low = probe +1;
			} else {
				high = probe -1; 

256 == 256 
Return Probe 

Probe = 8 
































*/