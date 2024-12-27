package guviPortalTaskOne;

public class printPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to print a below pattern => i and j and k => 5
		
		// 5 5 5 5 5
		// 5 4 4 4 4
		// 5 4 3 3 3
		// 5 4 3 2 2
		// 5 4 3 2 1
		
//		int controller = 0;
//		int occurrence = 0;
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				for(int k=5; k>0; k--) {
//					if( ( i == controller || j == controller ) && occurrence == 0 ) {
//						System.out.print(k);
//						occurrence++;
//					}
//						controller++;
//				}
//				controller = 0;
//				occurrence = 0;
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
		
		
		int n = 5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(n - j + 1 + " ");
			}
			for(int k=i; k<=n; k++) {
				System.out.print(n - i + 1 + " ");
			}
			System.out.println();
		}
	}
}
