package practice;

public class aaa {

	public static void main(String [] args) {
		int[] ar = { 10, 30, 70, 40, 15 };

		int max = ar[0];
		int idx = 0;
		int size = ar.length;
		int i;
		{
			for (i = 1; i < size; i = i + 1) {
				if (max < ar[i]) {
					max = ar[i];
					idx = i;
				}
			}
			System.out.println("가장 큰수 위치:" + idx);
		}
	}
}
