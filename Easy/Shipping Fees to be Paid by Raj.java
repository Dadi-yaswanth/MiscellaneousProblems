/* Raj has ordered two electronic items and a grocery item from an ecommerce website Nxt Trends. The items weigh X, Y, and Z kgs Respectively.

Free shipping for the order is available for up to D kgs of electronic items and E kgs of grocery items. If the combined weight of these items in respective categories exceeds the limits, then Raj will be charged for the excess weight in each category. Shipping fees are INR 10/kg for electronic items and INR 15/kg for grocery items.

Write a program that calculates the shipping fees to be paid by Raj 

Incase, there is no shipping fee, print Free Shipping
*/
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int [] list = new int [5];
        for(int i = 0 ; i <5;i++) {
            list[i] =  sc.nextInt();
        }
        int answer = check(list);
        System.out.println(answer==0? "Free shipping":answer);

    }
    public static int check(int[] arr){
        int costE = 0;
        int costG = 0;
        for(int i = 0 ; i<2;i++){
            if(arr[i]-arr[3]>0){
                costE = 10 * Math.abs(arr[i]-arr[3]);
            }
        }
        if(arr[2]-arr[4]>0){
            costG = 15 * Math.abs(arr[2]-arr[4]);
        }

        return costE+costG;
    }
}
