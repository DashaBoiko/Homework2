import java.util.Scanner;

public class Exercise1 {
    //Function for detecting the presence of a substring in a string
    public static boolean  contentStr (String str,String substr)
    {
        int i,j,k;
        int len1 = str.length(), len2 = substr.length();

        //Loop for first letter of comparison
        for(i=0;i<len1-len2+1;i++)
        {
            // Loop comparing elements
            // j - index of the second line
            k = 0;
            for(j=0;j<len2;j++)
            {
                if(str.charAt(i+j)==substr.charAt(j))
                    k++;
            }

            if(k==len2)return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = scn.nextLine();
        System.out.println("Enter a word: ");
        String substr = scn.nextLine();

        if(contentStr(str, substr))
            System.out.println("The word contained in the sentence");
        else
            System.out.println("The word is not contained in the sentence");

        scn.close();
    }

}