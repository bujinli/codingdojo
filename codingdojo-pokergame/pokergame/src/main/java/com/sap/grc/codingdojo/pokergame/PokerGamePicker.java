package com.sap.grc.codingdojo.pokergame;

import java.util.LinkedList;
import java.util.List;

public class PokerGamePicker {

	public int[] doPick(int n) {

		int[] input = initArray(n);
		int[] output = new int[n];

		List<Integer> inputList = initList(n);

		// if (n == 1 || n == 2) {
		// return inputList.stream().mapToInt(i -> i).toArray();
		// // return input;
		// } else {
		boolean isPick = true;
		int position = 0;
		int length = n;
		int pickPosition = 0;
		while (pickPosition < length) {
			if (isPick) {
				output[position] = inputList.get(pickPosition);
				isPick = false;
				position++;
			} else {
				inputList.add(inputList.get(pickPosition));
				isPick = true;
			}
			length = inputList.size();
			pickPosition++;
		}

		// for (int i = 0; i < inputList.size(); i++) {
		// if (isPick) {
		// output[i] = inputList.get(i);
		// isPick = false;
		// } else {
		// inputList.add(i + 1);
		// isPick = true;
		// }
		// }
		// }

		return output;
	}

	public int[] doPick2(int[] nArray) {

		// int[] input = initArray(n);
		int[] output = new int[nArray.length];

		// List<Integer> inputList = n;
		List<Integer> inputList = new LinkedList<>();
		for (int i : nArray) {
			inputList.add(i);
		}

		// if (n == 1 || n == 2) {
		// return inputList.stream().mapToInt(i -> i).toArray();
		// // return input;
		// } else {
		boolean isPick = true;
		int position = 0;
		int length = nArray.length;
		int pickPosition = 0;
		while (pickPosition < length) {
			if (isPick) {
				output[position] = inputList.get(pickPosition);
				isPick = false;
				position++;
			} else {
				inputList.add(inputList.get(pickPosition));
				isPick = true;
			}
			length = inputList.size();
			pickPosition++;
		}

		// for (int i = 0; i < inputList.size(); i++) {
		// if (isPick) {
		// output[i] = inputList.get(i);
		// isPick = false;
		// } else {
		// inputList.add(i + 1);
		// isPick = true;
		// }
		// }
		// }

		return output;
	}

	public int[] getOrderInput(int[] arr) {
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			output[arr[i] - 1] = i + 1;
		}

		return output;

	}

	private List<Integer> initList(int n) {
		List<Integer> input = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			input.add(i + 1);
		}
		return input;
	}

	private int[] initArray(int n) {
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = i + 1;
		}
		return input;
	}

}
