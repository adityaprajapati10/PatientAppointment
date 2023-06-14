
import java.util.Scanner;
public class HospitalMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Patient pat = new Patient();
        Doctor doc = new Doctor();

        while (flag) {
            System.out.println();
            System.out.println("PRESS 1: IF YOU ARE A PATIENT");
            System.out.println("PRESS 2: IF YOU ARE A DOCTOR");
            System.out.println("PRESS 3: TO EXIT");
            System.out.println();
            System.out.print("Enter Your Prefrence: ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    pat.getDetails();
                    break;
                case 2:
                    doc.getWork(pat.patientList);
                    break;
                case 3:
                    System.out.println("Thank You ...");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
        }
        sc.close();
    }
}
