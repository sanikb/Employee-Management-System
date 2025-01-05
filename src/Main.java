import java.util.Scanner;

import empmangemet.EmployeeService;

public class Main {

    EmployeeService service = new EmployeeService();
    static boolean ordering = true;
    public static void menu(){
        System.out.println("************Welcome to employee management system***********"
        +"\n1.Add Employee"
        +"\n2.View Employee"
        +"\n3.Update Employee"
        +"\n4.Delete Employee"
        +"\n5.View All Employee"
        +"\n6.Exit");
    }
    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        do{
            int choice = sc.nextInt();
            System.out.println("enter your choice");
            switch(choice){
                case 1:
                System.out.println("Add");
                service.addEmp();
                break;
                case 2:
                System.out.println("View");
                service.VeiwEmp();
                break;
                case 3:
                System.out.println("Update");
                service.updateEmp();
                break;
                case 4:
                System.out.println("Delete");
                service.deleteEmp();
                break;
                case 5:
                System.out.println("View All");
                service.ViewAllEmp();
                break;
                case 6:
                System.out.println("Thank for using application");
                System.exit(0);
                default:
                System.out.println("Choose correct option");
                break;
            }
            
        }while(ordering);
    }

}
