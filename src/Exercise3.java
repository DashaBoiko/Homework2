import java.util.Scanner;

public class Exercise3 {

    // Function for checking the correctness of the Israel phone number
    public static String checkTelephone(String tel)
    {
        //0504730464 - 10
        //050-4730464 - 11
        //972504730464 - 12

        int i, len = tel.length();

        // Normalize the phone
        String tel_norm="";


        // Check for length
        if(len<10||len>12)return "";

        // Check for the last 7 digits of the phone number
        for(i=len-7;i<len;i++)
        {
            if(tel.charAt(i)<'0'||tel.charAt(i)>'9')
                return "";
            else
                tel_norm += tel.charAt(i);

        }

        // Check the first three digits for the operator code
        if(len<12)
        {
            if(tel.charAt(0)!='0')return "";
            if(tel.charAt(1)<'0'||tel.charAt(1)>'9')return "";
            if(tel.charAt(2)<'0'||tel.charAt(2)>'9')return "";
            if(len==11 && tel.charAt(3)!='-')return "";
            tel_norm= "0" +tel.charAt(1)+tel.charAt(2)+"-"+tel_norm;
        }

        if(len==12)
        {
            if(tel.charAt(0)!='9'||tel.charAt(1)!='7'||tel.charAt(2)!='2')return "";
            if(tel.charAt(3)<'0'||tel.charAt(3)>'9')return "";
            if(tel.charAt(4)<'0'||tel.charAt(4)>'9')return "";
            tel_norm= "0" +tel.charAt(3)+tel.charAt(4)+"-"+tel_norm;
        }


        return tel_norm;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your phone number:");
        String tel = scn.nextLine();

        //Вызов функции
        String tel_norm = checkTelephone(tel);

        if(tel_norm=="")
            System.out.println("Invalid phone number entered");
        else
            System.out.println("Telephone: "+tel_norm);

        scn.close();

    }

}

