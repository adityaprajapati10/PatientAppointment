import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Doctor {
    Scanner sc = new Scanner(System.in);

    void getWork(List<ArrayList<Object>> patientList) {
        System.out.println("DOCTOR, ENTER YOUR EMPLOYEE ID: ");
        int employeeId = sc.nextInt();

        if(employeeId>110 || employeeId<101 ){
            System.out.print("Enter valid Employee code: ");
            employeeId = sc.nextInt();
        }

        if (employeeId == 101) {
            System.out.println("HELLO! Dr. Ram Kumar, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(1))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 102) {
            System.out.println("HELLO! Dr. Babu Bhaiya, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(2))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 103) {
            System.out.println("HELLO! Dr. Aashutos Agarwal, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(3))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 104) {
            System.out.println("HELLO! Dr. Nikhil Shukal, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(4))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 105) {
            System.out.println("HELLO! Dr. Tillu Yadav, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(5))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 106) {
            System.out.println("HELLO! Dr. Abhaya Pratap , your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(6))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 107) {
            System.out.println("HELLO! Dr. Aditya Mishra, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(7))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 108) {
            System.out.println("HELLO! Dr. Rishabh Rai, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(8))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 109) {
            System.out.println("HELLO! Dr. Adarsh Singh, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(9))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        if (employeeId == 110) {
            System.out.println("HELLO! Dr. Keshu Gupta, your patients are: ");
            for (ArrayList<Object> patient : patientList) {
                if(patient.get(4).equals(10))
                System.out.println(patient.get(0) + " - " + patient.get(1) + " - " + patient.get(2) + " - " + patient.get(3));
            }
        }

        

    }
}
