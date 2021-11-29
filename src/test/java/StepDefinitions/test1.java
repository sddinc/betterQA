package StepDefinitions;

import java.util.Scanner;

public class test1 {


        public static String StringChallenge(String str) {
            // code goes here

            String str2="";
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);




                if(c==' ' || !((c>='a' && c<='z') || (c>='A' && c <='Z')) ){



                    str2=str2+ String.valueOf(Character.toUpperCase( str.charAt(i+1)));
                }else{

                    str2=str2+ String.valueOf(Character.toLowerCase( str.charAt(i)));
                    // str2=str2+String.valueOf(c);
                }


            }

            str=str2;

            return str;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(StringChallenge(s.nextLine()));
        }


}
