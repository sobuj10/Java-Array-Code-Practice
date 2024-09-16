import java.util.*;

class ArraySortingDemo
{

    public static void main(String[] args)
    {

        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter no. of elements to sort : ");

			int size = in.nextInt();
			// initializing unsorted int array
			int inputArr[] = new int[size];
			System.out.println("Enter " + size + " integer(s) :");
			for (int i = 0; i < size; i++)
			{
				inputArr[i] = in.nextInt();
			}

			// let us print all the elements available in list
			for (int number : inputArr)
			{
			    System.out.println("Number = " + number);
			}

			// sorting array
			Arrays.sort(inputArr);

			// let us print all the elements available in list
			System.out.println("The sorted int array is:");
			for (int number : inputArr)
			{
			    System.out.println("Number = " + number);
			}
		}
    }
}