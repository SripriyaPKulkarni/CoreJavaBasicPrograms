package Basics;

public class mul510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=multiply(5,10);
	}

	public static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum=sum+i;
			System.out.println(sum);
			k++;
		}
		return sum;
	}

}
