import java.util.Scanner;
//import java.util.Scanner เพื่อใช้งานคำสั่ง Scanner ในการรับค่า

public class CSCAMP4_FinalProject {
    public static void main(String[] args) {
        String Alphabet[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", " " };
        // สร้าง string array เก็บตัวอักษรภาษาอังกฤษพิมพ์เล็ก
        int exit = 1, choice=69420;
        // กำหนดค่า exit=1 และ choice=69420 เพื่อป้องกันความผิดพลาดของโปรแกรม
        Scanner sc = new Scanner(System.in);
        // กำหนด sc เป็น keyword ที่ใช้ในการรับค่า
        boolean checkDup = false; // กำหนด checkDup เป็น boolean false เพื่อป้องกันความผิดพลาดของโปรแกรม
        System.out.println("*******************************************************************");
        System.out.println("\t\t\tBasic Caveman Enigma");
        System.out.println("*******************************************************************");
        System.out.println("Instructions: Input only lowercase letters.");
        System.out.print("Input Amount of Your Character: ");
        // print แสดง interface
        int Amount = sc.nextInt();
        // รับค่า Amount หรือ จำนวนตัวอักษรที่เราจะนำมาประมวลผลในโปรแกรม
        String[] words = new String[Amount];
        // สร้าง words โดย words จะเป็น array ที่เก็บอักษรเป็นตัว ๆ โดยขนาด arrayจะเท่ากับ Amount
        String Total = "";
        // สร้าง Total ใช้เก็บคำที่มีค่าเป็น string เรียงกันเป็นคำ
        for (int i = 0; i < words.length; i++) {
            System.out.print("Input your Character [" + i + "]: ");
            words[i] = sc.next();
            Total += words[i];
        }
        // loop รับตัวอักษร โดยจะเก็บตัวอักษรนั้นไว้ใน words และ Total
        System.out.println("Your words: " + Total);
        // แสดงผลคำที่เราใส่เข้ามา
        while (exit == 1) {
            // ถ้าค่า exit=1 จะเข้า while loop
            if (checkDup == false) {
                // ถ้า checkDup เป็น false ก็จะเข้าสู่การทำงานใน if
                System.out.println("[Select a function]\n(1) Encrypt\n(2) Decrypt\n(3) Change your string\n(4) Exit");
                System.out.print("Input function number: ");
                choice = sc.nextInt();
                // แสดงผลเพื่อให้เลือก case ที่จะใช้งาน
            } else if (checkDup == true) {
                checkDup = false;
                // ถ้า checkDup=true ก็เปลี่ยนให้ checkDup=false
            }
            switch (choice) {
                case 1:
                    // ถ้า choice=1 ก็จะเข้า case 1
                    Total = "";
                    // ล้าง string ใน Total
                    // ถ้ามีตัวอักษร"z"ใน words ให้เปลี่ยนเป็นตัวอักษร "a"
                    for (int i = 0; i < Amount; i++) {
                        if (words[i].equals("z")) {
                            words[i] = Alphabet[0];
                        } else {
                            // ถ้าไม่มีตัวอักษร"z"ใน words ให้เทียบตัวอีกษรใน words กับ array alphabet แล้ว
                            // เปลี่ยนตัวอักษรที่ได้มาเป็นตัวอักษรตัวถัดไป เช่น "a" -> "b"
                            // จนกว่าจะครบทุกตัวอักษร
                            for (int j = 0; j < Alphabet.length - 1; j++) {
                                if (words[i].equals(Alphabet[j])) {
                                    words[i] = Alphabet[j + 1];
                                    break;
                                }
                            }
                        }
                        Total += words[i];
                        // รวมตัวอักษรที่ได้มาเก็บใน Total
                    }
                    // แสดงผลลัพธ์แบบที่ถูกเปลี่ยนตำแน่งแล้ว
                    System.out.print("Encrypted: " + Total);
                    System.out.println("\n");
                    break;
                    //หยุดการทำงาน
                case 2:
                    // ถ้า choice=2 ก็จะเข้า case 2
                    Total = "";
                    // ล้าง string ใน Total
                    for (int i = 0; i < Amount; i++) {
                        if (words[i].equals("a")) {
                            words[i] = Alphabet[25];    
                            // ถ้ามีตัวอักษร"a"ใน words ให้เปลี่ยนเป็นตัวอักษร "z"                         
                        }
                        else {
                            // ถ้าไม่มีตัวอักษร"a"ใน words ให้เทียบตัวอีกษรใน words กับ array alphabet แล้ว
                            // เปลี่ยนตัวอักษรที่ได้มาเป็นตัวอักษรตัวก่อนหน้า เช่น "b" -> "a"
                            // จนกว่าจะครบทุกตัวอักษร
                            for (int j = 0; j < Alphabet.length - 1; j++) {
                                if (words[i].equals(Alphabet[j])) {
                                    words[i] = Alphabet[j - 1];
                                    break;
                                }
                            }
                        }
                        Total += words[i];
                        // รวมตัวอักษรที่ได้มาเก็บใน Total
                    }
                    // แสดงผลลัพธ์แบบที่ถูกเปลี่ยนตำแน่งแล้ว
                    System.out.println("Decrypted: " + Total + "\n");
                    break;
                    //หยุดการทำงาน
                case 3:
                    //ถ้า choice=3 ก็จะเข้า case 3
                    System.out.print("Input Amount of Your Character: ");
                    // รับค่า Amount หรือ จำนวนตัวอักษรที่เราจะนำมาประมวลผลในโปรแกรม
                    Amount = sc.nextInt();
                    words = new String[Amount];
                    //array words ที่เก็บอักษรเป็นตัวๆ โดยขนาด arrayจะเท่ากับ Amount
                    Total = "";
                    // ล้าง string ใน Total
                    for (int i = 0; i < words.length; i++) {
                        System.out.print("Input your Character [" + i + "]: ");
                        words[i] = sc.next();
                        Total += words[i];
                    }
                    // loop รับตัวอักษร โดยจะเก็บตัวอักษรนั้นไว้ใน words และ Total
                    System.out.println("Your words: " + Total);
                    // แสดงผลคำที่เราใส่เข้ามา
                    System.out.println("\n[Select a function]\n(1) Encrypt\n(2) Decrypt\n[(3) Disabled]\n(4) Exit");
                    System.out.print("\nInput function number: ");
                    choice = sc.nextInt();
                    // แสดงผลเพื่อให้เลือก case ที่จะใช้งาน
                    checkDup = true;
                    // ตั้งค่า checkDup เป็น true เพื่อไม่ให้แสดง menu ซ้ำ
                    break;
                    // หยุดการทำงาน
                case 4:
                    exit = 0; 
                    // ออกจาก while loop
                    break;
                    // หยุดการทำงาน
            }
        }
    }
}
