package Arrays;

public class Sumof5 {

	//create a method to accept array and return sum of 5 elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1,2,3,4,5};
		int sum=sumArray(a);
		System.out.println(sum);
	}

	public static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
