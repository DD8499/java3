package geekster3;

public class ParticularEle {
	public static void main(String args[])
	{
	

	int x[]= {1,2,4,6,8,12,76,23,64};
	
	int n=76;
	System.out.print("Initially array element is :");
	for(int i=0;i<x.length;i++)	{
	 System.out.print(x[i]+" \t");
	}
	
	for(int i=0;i<x.length;i++)
	{
		if(x[i]==n)
		{
			x[i]=0;
			
		}
	}
	System.out.println();
	System.out.print("Final array element is     :");
	for(int i=0;i<x.length;i++)
	{
	 System.out.print(x[i]+ "\t");
	}
}
}
