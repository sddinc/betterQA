package StepDefinitions.Interview;

public class sort {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,7,9};
int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
           if(arr[i]>arr[j]){


               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }


            }
        }
        for (int x = 0; x <arr.length ; x++) {
            System.out.println(arr[x]);
        }



    }
}
