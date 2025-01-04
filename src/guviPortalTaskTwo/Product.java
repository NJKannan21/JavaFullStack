package guviPortalTaskTwo;

// Problem 1.2

import java.util.Scanner;

public class Product {
	int Pid;
	int price;
	int quantiny;
	
	Product(int id, int amt, int quant){
		this.Pid = id;
		this.price = amt;
		this.quantiny= quant;
	}

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println(" Enter how many products you want to handle ");
		int prodCnt = scanObj.nextInt();
		int [][] products = new int[prodCnt][3];
		int prodPos = 0;
		
		for(int i=0; i<prodCnt; i++) {
			prodPos = i +1 ;
			for(int j=0; j<3; j++) {
				switch(j) {
					case 0:
						System.out.println(" Enter the " + prodPos  +  " product id ");
						break;
					case 1:
						System.out.println(" Enter the " + prodPos  +  " product price ");
						break;
					default:
						System.out.println(" Enter the " + prodPos  +  " product quantiny ");
				}
				products[i][j]= scanObj.nextInt();
			}
		}
		highestPriceAndTotalAmt(products);
		scanObj.close();
 	}
	
	public static void highestPriceAndTotalAmt(int [][] prodArry) {
		int highProdPrice = prodArry[0][1];
		int highProdid = prodArry[0][0];
		int singleProdAmt = Integer.MIN_VALUE;
		int totalProdAmt = 0;
		for(int i=0; i<prodArry.length; i++) {
			if(prodArry[i][1] > highProdPrice) {
				highProdPrice = prodArry[i][1];
				highProdid = prodArry[i][0];
			}
			singleProdAmt = prodArry[i][1] * prodArry[i][2];
			totalProdAmt += singleProdAmt;
		}
		System.out.println(" Highest price having product id :: " + highProdid );
		System.out.println(" Highest price of the product :: " + highProdPrice );
		System.out.println(" Total amount spent on all products :: " + totalProdAmt );
	}

}
