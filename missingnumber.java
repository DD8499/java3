package geekster3;

public class missingnumber {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
		int sum=0;
		int n=15;
		int actualsum = (n*(n+1))/2;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		n=actualsum-sum;
		System.out.println("The missing number is : " + n);
	}
}
