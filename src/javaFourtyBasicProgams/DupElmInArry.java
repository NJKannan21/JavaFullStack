package javaFourtyBasicProgams;

public class DupElmInArry {
	public static void main(String[] args) {
		int[] arry = {4,7,9,3,6,2,6,9,3,5};
		
		for(int idx=0; idx < arry.length; idx++) {
			for(int elm=0; elm < arry.length; elm++ ) {
				if(idx != elm && arry[idx] == arry[elm]) {
					System.out.println("Duplicate Element : " + arry[elm]);
				}
			}
		}
		
	}
}
