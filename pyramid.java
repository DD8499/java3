package geekster3;

public class pyramid {
public static void main(String[] args) {
		
		int n=11;
	
		for(int i=1;n>=i;i++)
		{
			
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
            for(int j=2;j<=i;j++)
            {
                System.out.print(" *");
            }
			
			
			System.out.println();
		}
}
}
