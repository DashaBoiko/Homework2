import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    // Function for removing identical elements from an array
    public static int[] removeDuplicateElements(int[] array)
    {
        //0 1 2 3 4 5 6 7 8 9 10
        //1 4 7 1 8 9 2 1 3 8 0

        int i,j,number=0,k=0;
        for(i=0;i<array.length;i++)
        {
            if(array[i]!=1000)number++;
            for(j=i+1;j<array.length;j++)
            {
                if(array[i]!=1000 && array[j]!=1000 && array[i]==array[j])
                {
                    array[j] = 1000;
                }
            }
        }

        //1 1 1 2 2

        //0  1    2   3   4
        //1 1000 1000 2 1000
        //array2[0] = 1
        //array2[1] = 2

        int []array2 = new int[number];
        for(i=0;i<array.length;i++)
        {
            if(array[i]!=1000)
            {
                array2[k] = array[i];
                k++;
            }
        }

        return array2;
    }


    public static void main(String[] args)
    {
        int i,n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array ->");
        n = scn.nextInt();

        // Allocate dynamic memory to an array
        int []mas = new int[n];


        Random rnd = new Random();

        // Generate an array at random with numbers from 1 to 10
        for(i=0;i<mas.length;i++)
            mas[i] = rnd.nextInt(10)+1;

        System.out.println("\n\nArray output");

        //Array output
        for(i=0;i<mas.length;i++)
        {
            System.out.print(mas[i]+ "  ");
        }


        System.out.println("\n\nOutputting an array without duplicates");
        int[]mas2 = removeDuplicateElements(mas);
        //Outputting an array without duplicates
        for(i=0;i<mas2.length;i++)
        {
            System.out.print(mas2[i]+ "  ");
        }



        scn.close();

    }

}




