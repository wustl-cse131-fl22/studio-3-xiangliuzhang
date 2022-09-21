package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = in.nextInt();
		
		int ind = 0;
		int[] array = new int[number-1];
		boolean[] logicArray = new boolean[number-1];
		for (int i = 2; i <= number; i++)
		{
			array[ind] = i;
			logicArray[ind] = true;
			ind++;
		}
		
//		for (int value: array)
//			System.out.print(value + " ");
//		System.out.println();
//		for (boolean logic: logicArray)
//			System.out.print(logic + " ");
//		System.out.println();
		
		for (int place = 0; place < (array.length+1)/2; place++)
		{
			for (int multiplier = 2; multiplier <= (number)/array[place]; multiplier++)
			{
				if (array[place]*multiplier <= number)
				{
					ind = array[place]*multiplier - 2;
					logicArray[ind] = false;
				}
			}
		}
		for (int index = 0; index < logicArray.length; index++)
		{
			if (logicArray[index] == true)
				System.out.print(array[index] + " ");
		}
	}

}
