package star_Pattern;

public class Double_Hill3 {

	public static void main(String[] args) {

		/*
		 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
		 * * * * * * * *
		 */
//method 1 by code optimization
//		for (int i = 0; i <= 4; i++) {
//			for ( int num = 0; num < 10; num++) // this loop will print the pyramid .to multplie number of times
//			{
//				for (int j = 4; j > i; j--) {
//					System.out.print("  "); // @
//				}
//				for (int k = 0; k <= i; k++) {
//					System.out.print(" *");
//				}
//				for (int l = 1; l <= i; l++) {
//					System.out.print(" *");
//				}
//				for (int m = 4; m > i; m--) {
//					System.out.print("  "); // #
//				}
//			}
//			System.out.println(" ");
//		}
			
 //Method 2 without code optimization
		for(int num = 0;num<=10;num++) // this looop will print 10 times
		{
			for (int i = 0; i <= 4; i++) 
			{
				for (int j = 4; j > i; j--) 
				{
					System.out.print("  "); // @
				}
				for (int k = 0; k <= i; k++) {
					System.out.print(" *");
				}
				for (int l = 1; l <= i; l++) {
					System.out.print(" *");
				}
				for (int m = 4; m > i; m--) {
					System.out.print("  "); // #
				}
				for(int n = 4; n>i;n--) {
					System.out.print("  "); //$
				}
				for(int o = 0;o<=i;o++) {
					System.out.print(" *");
				}
				for(int p= 1;p<=i;p++) {
					System.out.print(" *");
				}
			System.out.println(" ");
			}

		}

	}

}
