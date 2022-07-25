import java.util.Scanner;
public class CSCAMP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int input = sc.nextInt();
        if(input >= 80){
            System.out.println("Your grade is A");
        }
        else if(input >= 70){
            System.out.println("Your grade is B");
        }
        else if(input >= 60){
            System.out.println("Your grade is C");
        }
        else if(input >= 50){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }
    }
}
