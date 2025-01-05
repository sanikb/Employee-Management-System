package empmangemet;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(1, "sani", 10, "devloper", "IT", 30000);
    Employee emp2 = new Employee(11, "sanika", 20, "sys-devloper", "IT-manager", 40000);

    Scanner sc = new Scanner(System.in);
    boolean found=false;
    int id;
    String name;
    int age;
    String designation;
    String department;
    double salary;

    public EmployeeService() {

        empset.add(emp1);
        empset.add(emp2);

    }

    // view all employee
    public void ViewAllEmp(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }

    // view employee base on id
    public void VeiwEmp(){
        System.out.println("Enter id");
        id = sc.nextInt();
        for(Employee emp:empset){
            if(emp.getId()==id){
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee with this id not present");
        }
    }

    // update the employee
    public void updateEmp(){
        System.out.println("enter id");
        id=sc.nextInt();
        boolean found=false;
        for(Employee emp:empset){
            if(emp.getId()==id){
                System.out.println("enter name :");
                name=sc.next();
                System.out.println("enter new salary :");
                salary=sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Updated detais of employee are :");
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("employee is not present");
        }
        else{
            System.out.println("employee details updated succesfully");
        }

    }

    // delete  employee
    public void deleteEmp(){
        System.out.println("Enter id :");
        id=sc.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for(Employee emp:empset){
            if(emp.getId()==id){
                empdelete = emp;
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee not present");
        }else{
            empset.remove(empdelete);
            System.out.println("Employee delete successfully");
        }
    }

    // add employee

    public void addEmp(){
        System.out.println("enter id :");
        id=sc.nextInt();
        System.out.println("enter name :");
        name=sc.next();
        System.out.println("enter age :");
        age=sc.nextInt();
        System.out.println("enter designation :");
        designation = sc.next();
        System.out.println("enter department :");
        department = sc.next();
        System.out.println("enter salary :");
        salary = sc.nextDouble();

        Employee emp = new Employee(id, name, age, designation, department, salary);

        empset.add(emp);
        System.out.println("Employee added succesfully");
    }

}
