package StepDefinitions;

public class deneme {

    public static void main(String[] args) {
        String str="cats AND*Dogs-are Awesome";
        String str2=" ";


        int []arr = new int [str.length()];

        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(c==' ' || !Character.isLetter(c) ){

                str2=str2+ String.valueOf(Character.toUpperCase( str.charAt(i+1)));
                i++;




            }else{

                str2=str2+ String.valueOf(Character.toLowerCase( str.charAt(i)));
                // str2=str2+String.valueOf(c);
            }

        }

        System.out.println(str2);

    }
}
