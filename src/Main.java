import java.util.Scanner;

public class Main {
    private static int[] arr=new int[10];
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 10 Numbers As u wish");
        for(int x=0;x<10;x++){
            System.out.print((x+1)+" number : ");
            int i= input.nextInt();
            arr[x]=i;
        }
        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int y=0;y<n-1;y++){
            for(int z=0;z<n-1;z++){
                if (arr[z] > arr[z+1]) {
                    int temp=arr[z];
                    arr[z]=arr[z+1];
                    arr[z+1]=temp;
                }
            }
        }
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" , ");
        }
        System.out.print("\b\b]");
    }
}
