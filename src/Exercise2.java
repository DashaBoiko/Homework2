import java.util.Scanner;

public class Exercise2 {

    // The function receives an array, the elements of which will be entered by the user
    public static void numberGreaterThanAverage(int []array)
    {
        int i;
        double sum=0, average;

        // Calculate the sum of the elements
        for(i=0;i<array.length;i++)
        {
            sum+=array[i];// sum = sum + array[i]
        }

        average = sum/array.length;

        //  larger than average
        for(i=0;i<array.length;i++)
        {
            if(array[i]>average)
                System.out.print(array[i]+"  ");
        }


    }

    public static void main(String[] args)
    {
        int i,n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array ->");
        n = scn.nextInt();

        // Allocate dynamic memory to an array
        int []array = new int[n];

        //input the array
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter "+ i +" element of the array ->");
            array[i] = scn.nextInt();
        }

        System.out.println("\n\nArray output ");

        // Output the array
        for(i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ "  ");
        }

        System.out.println("\n\nDisplaying values greater than average ");
        // Call the function
        numberGreaterThanAverage(array);
        scn.close();
    }

}






