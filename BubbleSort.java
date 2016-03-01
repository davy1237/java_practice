import java.util.*;

public class BubbleSort {
	public static void main(String args[]) {
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			inputs.add(input.nextInt());
		} 
		inputs = bubbleSort(inputs);
		System.out.println(inputs);
	}

	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> inputs) {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < inputs.size(); i++) {
				if (inputs.get(i - 1) > inputs.get(i)) {
					int temp = inputs.get(i - 1);
					inputs.set(i - 1, inputs.get(i));
					inputs.set(i, temp);
					swapped = true;
				}
			}
		}
		return inputs;
	}
}