package javaFourtyBasicProgams;

public class FindTheMostOccurElmArry {

	public static void main(String[] args) {
		
		// Question : Write a Program to find the element that appears the most times in a array in 1-D Array.
		// If there are multiple elements with the same maximum frequency then return the smallest one . 

		
		// int[] arry = { 1, 2, 2, 2, 3, 3, 3, 1, 4, 1 };
		int[] arry = { 3, 2, 2, 2, 1, 1, 1, 3, 4, 3 };
		
		int mostOccrElm = Integer.MIN_VALUE;
		int maxFreq = 0;
		
		for(int val : arry) {
			int currElm = val;
			int currFreq = 0;
			for(int i=0; i<arry.length; i++ ) {
				if(val == arry[i]) {
					currFreq++;
				}
			}
			
			if(maxFreq < currFreq) {
				mostOccrElm = currElm;
				maxFreq = currFreq;
			} else if( maxFreq == currFreq ) {
				if(mostOccrElm > currElm) {
					mostOccrElm = currElm;
				}
			}
		}
		System.out.print(mostOccrElm + " is freaquently occured and the occurence count is :  " + maxFreq);
	}

}
