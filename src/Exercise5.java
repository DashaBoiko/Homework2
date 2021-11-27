import java.util.Scanner;

public class Exercise5 {
    // Function for determining an ascending-descending array
    public static int ascendingDescendingArray (int[] array)
    {
        //0 1 2 3  4  5 6 7 8
        //1,3,6,11,10,9,4,2,0

        //6 12 11 15

        //4 6 2


        int i;
        int k_v = 0,k_n = 0;
        boolean kl_v = true;
        boolean kl_n = true;

        for(i=0;i<array.length-1;i++)
        {
            if(kl_v&&array[i+1]>array[i])
            {
                k_v++;
                continue;
            }
            else
                kl_v = false;

            if(kl_n&&array[i+1]<array[i])
            {
                k_n++;
                continue;
            }
            else
                break;

        }


        if(k_v>0 && k_n>0 && k_v+k_n == array.length-1)
            return k_v;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        int i,n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array ->");
        n = scn.nextInt();

        // Allocate dynamic memory to an array
        int []array = new int[n];


        //Random rnd = new Random();

        // Enter the array manually

        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter "+ i +" element of the array ->");
            array[i] = scn.nextInt();
        }



        // Generate an array at random with numbers from 1 to 10


        System.out.println("\n\nArray output");

        //Array output
        for(i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ "  ");
        }


        int idx = ascendingDescendingArray(array);
        System.out.println("\n\nPeak index = " + idx);

        scn.close();

    }

}














