package geekster3;

public class MinMaxNum {

	public static void main(String args[]) {
		int[] arr= {11,2,4,5,9,7,14};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
		
		if(arr[i]>max) 
			max=arr[i];
		}
		
				
	
	
	System.out.println(max);
}
}
