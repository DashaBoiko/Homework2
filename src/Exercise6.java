import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    // Function of intersection of two arrays
    public static int[] ArrayCrossing(int []array1, int []array2)
    {
        //1 2 2
        //2 2 4
        int i,j,k=0;

        int []vr = new int[array1.length];

        for(i=0;i<array1.length;i++)
        {
            for(j=0;j<array2.length;j++)
            {
                if(array2[j]!=1000 && array1[i]==array2[j])
                {
                    vr[k] = array1[i];
                    k++;
                    array2[j] = 1000;
                    break;
                }
            }
        }


        int []tempArray = null;
        if(k>0)
        {
           tempArray = new int[k];
            for(i=0;i<tempArray.length;i++)
               tempArray[i] = vr[i];
        }


        return tempArray;
    }

    // Function for checking foreign elements
    public static boolean checkForeignElements(int []array1, int []array2)
    {

        int []tempArray2 = ArrayCrossing(array1,array2);
        if(tempArray2==null)return true;
        else return false;
    }


    public static void main(String[] args)
    {
        int i,numberOfElements;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements of the arrays ->");
        numberOfElements = scn.nextInt();


        int []array1 = new int[numberOfElements];
        int []array2 = new int[numberOfElements];


        Random rnd = new Random();

        for(i=0;i<array1.length;i++)
        {
            array1[i] = rnd.nextInt(90)+10;
            array2[i] = rnd.nextInt(90)+10;
        }

        System.out.println("\n\nArray output 1");

        //Array output
        for(i=0;i<array1.length;i++)
        {
            System.out.print(array1[i]+ "  ");
        }

        System.out.println("\n\nArray output 2");

        //Array output
        for(i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]+ "  ");
        }



        int []array3 = ArrayCrossing(array1,array2);
        if(array3!=null)
        {
            System.out.println("\n\nOutput crossing");

            for(i=0;i<array3.length;i++)
            {
                System.out.print(array3[i]+ "  ");
            }
        }

        else
        {
            System.out.println("\n\nArrays are foreign");
        }


        scn.close();

    }
}

