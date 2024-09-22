package star_Pattern;

public class Double_Hill {

	public static void main(String[] args) {

/*								        *             *  
								      * * *         * * * 
								    * * * * *     * * * * * 
								  * * * * * * *  * * * * * * * 
 								* * * * * * * * * * * * * * * * 
 */
		
		
		for(int i = 0;i<=4;i++) 
		{
			
			for(int j = 4;j>=i;j--) {
				System.out.print("  "); //@
			}
			for (int k = 0;k<=i;k++) {
				System.out.print(" *");
			}
			for (int l= 1 ;l<=i;l++) {
				System.out.print(" *");
			}
			for(int m=4;m>i;m--)
			{
				System.out.print("  "); //#
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
