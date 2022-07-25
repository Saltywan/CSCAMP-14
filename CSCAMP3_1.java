import java.util.Scanner;
public class CSCAMP3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ten=0, five=0, two=0, one=0;
        System.out.print("Enter the amount: ");
        int n = sc.nextInt();
        if(n>0){
            while(n >= 10){
                n-=10;
                ten++;
         }
            while(n >= 5){
                n-=5;
                five++;
            }
            while(n >= 2){
                n-=2;
                two++;
            }
            while(n >= 1){
                n-=1;
                one++;
            }
        }
        System.out.println("10: "+ten+"\n5: "+five+"\n2: "+two+"\n1: "+one);
        }
            }
