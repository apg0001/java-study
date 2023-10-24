package moso_hw_01;

import java.util.ArrayList;

abstract class Person {
    String personName;
    String birthDate;
    String homeAddress;

    public Person(String n, String date, String address) {
        personName = n;
        birthDate = date;
        homeAddress = address;
    }

    String getName() {
        return personName;
    }

    String getBirthDate() {
        return birthDate;
    }

    void setName(String n) {
        personName = n;
    }

    void setBirthDate(String date) {
        birthDate = date;
    }
}

class Employee extends Person {
    String employeeID;
    int monthlySalary;

    Employee(String name, String date, String address, int salary, String id) {
        super(name, date, address);
        monthlySalary = salary;
        employeeID = id;
    }

    int getMonthlySalary() {
        return monthlySalary;
    }
}

class Student extends Person {
    String studentID;
    double GPA;

    Student(String name, String date, String address, double gpa, String id) {
        super(name, date, address);
        GPA = gpa;
        studentID = id;
    }

    double getGPA() {
        return GPA;
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        ArrayList<Student> studentList = new ArrayList<Student>();

        employeeList.add(new Employee("박기찬", "2001/07/11", "충청북도 제천시", 7500000, "00000000"));
        employeeList.add(new Employee("이경서", "1999/04/04", "서울특별시", 5000000, "11111111"));
        employeeList.add(new Employee("강슬기", "1994/02/10", "경기도 안산시", 4500000, "22222222"));
        employeeList.add(new Employee("현승희", "1996/01/25", "강원도 춘천시", 4750000, "33333333"));
        employeeList.add(new Employee("김지우", "1999/10/20", "서울특별시", 5500000, "44444444"));

        studentList.add(new Student("김민정", "2001/01/01", "경상남도 양산시", 4.5, "2020555555"));
        studentList.add(new Student("김다미", "1995/04/09", "서울특별시", 4.2, "2015666666"));
        studentList.add(new Student("김다현", "1998/05/28", "경기도 성남시", 4.0, "2017777777"));
        studentList.add(new Student("서현진", "1985/02/27", "서울특별시", 3.5, "2004888888"));
        studentList.add(new Student("박보영", "1990/02/12", "충청북도 괴산군", 3.0, "2009999999"));

        double totalEmployeeSalary = 0;
        double totalStudentGpa = 0;

        for (Employee emp : employeeList) {
            totalEmployeeSalary += emp.getMonthlySalary();
        }
        for (Student std : studentList) {
            totalStudentGpa += std.getGPA();
        }

        double avgEmployeeSalary = totalEmployeeSalary / employeeList.size();
        double avgStudentGpa = totalStudentGpa / studentList.size();
        System.out.println("Employee들의 평균 월급은 " + avgEmployeeSalary + "원입니다.");
        System.out.println("Student들의 평균 학점(GPA)는 " + avgStudentGpa + "점입니다.");
    }
}
