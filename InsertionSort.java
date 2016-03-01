import java.util.*;

public class InsertionSort {
	public static void main(String args[]) {
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			inputs.add(input.nextInt());
		} 
		inputs = insertionSort(inputs);
		System.out.println(inputs);
	}

	public static ArrayList<Integer> insertionSort(ArrayList<Integer> inputs) {
		for (int i = 1; i < inputs.size(); i++) {
    		int temp = inputs.get(i);
    		int j = i - 1;
   			while (j >= 0 && inputs.get(j) > temp) {
   				inputs.set(j+1, inputs.get(j));
        		j = j - 1;
        	}
        	if(j != i-1)
 		   		inputs.set(j+1, temp);
    	}
    	return inputs;
	}
}