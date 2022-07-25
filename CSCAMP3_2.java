import java.util.Scanner;
public class CSCAMP3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ten=0, five=0, two=0, one=0;
        System.out.print("Enter the amount: ");
        int n = sc.nextInt();
        if(n>0){
        while (n/10>0){
            ten=n/10;
            n%=10; 
        }
        while (n/5>0){
            five=n/5;
            n%=5; 
        }
        while (n/2>0){
            two=n/2;
            n%=2; 
        }
        while (n>0){
            one=n;
            n=0;
        }
        //Yay!
        }
        System.out.println("10: "+ten+"\n5: "+five+"\n2: "+two+"\n1: "+one);
    }
}
