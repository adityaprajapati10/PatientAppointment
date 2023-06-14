import java.util.*;
class Department{
    Scanner sc = new Scanner(System.in);
        public int getDepartment(){
          System.out.println("PRESS 1  : FOR  ENT");
          System.out.println("PRESS 2  : FOR  ORTHOLOGY");  
          System.out.println("PRESS 3  : FOR  CARDIOLOGY");
          System.out.println("PRESS 4  : FOR  PATHOLOGY");
          System.out.println("PRESS 5  : FOR  DERMATOLOGY");
          System.out.println("PRESS 6  : FOR  PHYSIOTHERAOY");
          System.out.println("PRESS 7  : FOR  SEXUAL HEALTH");
          System.out.println("PRESS 8  : FOR  GYNAECOLOGIST");
          System.out.println("PRESS 9  : FOR  PEDIATRICIAN");
          System.out.println("PRESS 10 : FOR  PSYCHOLOGY");
          System.out.println();
          System.out.print("PRESS Number According to your Prefrence: ");
          int choose = sc.nextInt();
          switch(choose){
            case 1: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D1");//EmpId:- 101
                break;
            case 2: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D2");//EmpId:- 102
                break;
            case 3: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D3");//EmpId:- 103
                break;
            case 4: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D4");//EmpId:- 104
                break;    
            case 5: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D5");//EmpId:- 105
                break; 
            case 6: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+"D6" );//EmpId:- 106
                break;  
            case 7: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D7");//EmpId:- 107
                break;   
            case 8: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D8");//EmpId:- 108
                break;    
            case 9: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D9");//EmpId:- 109
                break; 
            case 10: 
                System.out.println("Congratulation ! appointment is booked and your Doctor is "+ "D10");//EmpId:- 110
                break;  
            default: System.out.println("Enter valid Input ");
                              
          }
          return choose;
        }
    }

