import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Patient {
    Scanner sc = new Scanner(System.in);
    String name ;
    List<ArrayList<Object>> patientList = new ArrayList<>();

    void getDetails() {
        ArrayList<Object> patientDetails = new ArrayList<>();
        System.out.print("PLEASE ENTER YOUR NAME: ");
        name = sc.nextLine();
        patientDetails.add(name);
        System.out.print("ENTER YOUR PHONE NUMBER: ");
        long phone = sc.nextLong();
        patientDetails.add(phone);
        System.out.print("ENTER YOUR AGE: ");
        int age = sc.nextInt();
        patientDetails.add(age);
        sc.nextLine();
        System.out.print("ENTER YOUR GENDER(Male/Female/Other): ");
        String gender = sc.nextLine();
        patientDetails.add(gender);
        System.out.println("Please Select Department: ");
        Department dep = new Department();
        int department = dep.getDepartment();
        patientDetails.add(department);
        patientList.add(patientDetails);
        //System.out.print(patientList);
    }
}
