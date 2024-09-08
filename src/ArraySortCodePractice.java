import java.util.Arrays;

class ArraySortCodePractice
{
    // This program is the example of  array sorting
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // initializing unsorted  array
        String arraylist[] = {"Sobuj", "Bob", "Alice", "Wonder", "Land"};

        // sorting array
        Arrays.sort(arraylist);

        // let us print all the elements available in list
        System.out.println("Sorted array is:");
        for (int i = 0; i < arraylist.length; i++)
        {
            System.out.println(arraylist[i]);
        }
    }
}