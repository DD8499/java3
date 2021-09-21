package geekster3;

public class MinValue {
	public static void main(String args[]) {
		int[] arr= {11,2,4,5,9,7,14};
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
		
		if(arr[i]<min) 
			min=arr[i];
		}
		
				
	
	
	System.out.println(min);
}
}


