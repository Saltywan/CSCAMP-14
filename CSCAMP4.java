import java.util.Scanner;
public class CSCAMP4 {
    public static void main(String[] args) {
        char A;
        int key, exit=1, choice=69420;
        Scanner sc = new Scanner(System.in);
        boolean checkDup = false;
        System.out.println("*******************************************************************");
        System.out.println("\t\t\tSimple Enigma");
        System.out.println("*******************************************************************");
        System.out.print("Input your string: ");
        String input = sc.nextLine();
        int[] ASCII = new int[input.length()];
        while(exit==1){
        if(checkDup==false){
            System.out.println("[Select a function]\n(1) Encrypt\n(2) Decrypt\n(3) Change your string\n(4) Exit");
            System.out.print("Input function number: ");
            choice = sc.nextInt();
        }
        else if(checkDup==true){
            checkDup=false;
        }
        switch (choice){
            case 1:
                System.out.print("Input your key (Number): ");
                key = sc.nextInt();
                System.out.print("Encrypted: ");
                for (int i = 0; i < input.length(); i++) {
                    A=input.charAt(i);
                    ASCII[i]=((int)A+key);
                    System.out.print((char)(ASCII[i]));
                }
                System.out.println("\n");
                break;
            case 2:
                System.out.print("\nInput your key (Number): ");
                key = sc.nextInt();
                String x = "";
                for (int i = 0; i < input.length(); i++) {
                    x += (char)(ASCII[i]-key); 
                }
                System.out.println("Decrypted: " + x + "\n");
                break;
            case 3:
                sc.nextLine();    
                System.out.print("\nInput your string: ");
                input = sc.nextLine();        
                System.out.println("\n[Select a function]\n(1) Encrypt\n(2) Decrypt\n[(3) Disabled]\n(4) Exit");
                System.out.print("\nInput function number: ");
                choice = sc.nextInt();       
                checkDup = true;
                break;
            case 4:
                exit=0;
                break;
        }
        }
    }
}
