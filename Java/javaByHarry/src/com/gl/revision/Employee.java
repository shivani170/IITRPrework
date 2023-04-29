package com.gl.revision;
public class Employee {

    String employeeId;
    String employeeName;
    int employeePhone;
    String employeeAddress;

//    public Employee(){
//        //constructor is a special type of method
//        //constructor will not have return type
//        //initialize string to null
//        //numeric to 0
//
//        employeeId = "E001";
//        employeeName = "Shivani Bhatt";
//        System.out.println(("Default constructor"));
//    }

    public void displayEmployeeDetails()
    {
        System.out.println(("Employee Details are: "));
        System.out.println(("Employee IDe: " +employeeId));
        System.out.println(("Employee Name: " +employeeName));
        System.out.println(("Employee Address: " +employeeAddress));
        System.out.println(("Employee Address: " +employeePhone));

    }

    public Employee(String employeeId, String employeeName, String employeeAddress, int employeePhone)
    {
        employeeId = "W001";
        employeeName = "Shivani Bhatt";
        employeeAddress = "Gurgaon";
    }

    //Methods
    public static void main(String[] args) {
        System.out.println("test");
//        Employee rajan = new Employee();
//        rajan.displayEmployeeDetails();
//
//        Employee shivani = new Employee();
    }
}
