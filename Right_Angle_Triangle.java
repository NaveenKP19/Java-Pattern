package star_Pattern;

public class Right_Angle_Triangle {

	public static void main(String[] args) {
		/*
		 *            * 
		 *            * *
		 *            * * *
		 *            * * * *
		 *            * * * * *
		 */
		
		
		for (int i=1;i<=5;i++ )
		{
			for (int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
