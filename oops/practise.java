package javaProgram.oops;
 
class Employee1 {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;

    }

}

public class practise {
    public static void main(String[] args) {
        // problem 1(lecture no. 39 -by Code with harry)
        Employee1 shaibal = new Employee1();
        shaibal.salary = 12000;
        shaibal.name = "Shaibal Kumar Pathak";
        System.out.println(shaibal.getsalary());
        System.out.println(shaibal.getname());

    }

}
