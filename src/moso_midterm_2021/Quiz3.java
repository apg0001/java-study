package moso_midterm_2021;
import java.util.Scanner;
import java.util.Vector;

class Employee {
    String myName;
    int myWage;

    Employee(String n, int w) {
        myName = n;
        myWage = w;
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        int index=0;

        Vector<Employee> employees = new Vector<Employee>();
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            int num = Integer.parseInt(scan.nextLine());

            employees.add(new Employee(str, num));
        }

        for(int i=0;i<5;i++) {
            if (employees.get(i).myWage > employees.get(index).myWage) {
                index = i;
            }
        }

        System.out.println(employees.get(index).myName);
    }
}
