package moso_hw_02;
import java.util.Vector;

class Person{
    String personName;
    String birthDate;
    String homeAddress;
    public Person(String n, String date, String address){
        this.personName=n;
        this.birthDate=date;
        this.homeAddress=address;
    }
    String getName(){
        return this.personName;
    }
    String getBirthDate(){
        return this.birthDate;
    }
    void setName(String n){
        this.personName=n;
    }
    void setBirthDate(String date){
        this.birthDate=date;
    }
}

class Employee extends Person{
    String employeeID;
    int monthlySalary;
    Employee(String name, String date, String address, int salary, String id){
        super(name, date, address);
        /*super.personName=name;
        super.birthDate=date;
        super.homeAddress=address;*/
        this.monthlySalary=salary;
        this.employeeID=id;
    }
    int getMonthlySalary(){
        return this.monthlySalary;
    }
}

class Student extends Person{
    String studentID;
    double GPA;
    Student(String name, String date, String address, double gpa, String id){
        super(name, date, address);
        /*super.personName=name;
        super.birthDate=date;
        super.homeAddress=address;*/
        this.GPA=gpa;
        this.studentID=id;
    }
    double getGPA(){
        return this.GPA;
    }
}


public class _03 {
    public static void main(String[] args) {
        Vector<Person> personList = new Vector<Person>();

        personList.add(new Employee("박기찬", "2001/07/11", "충청북도 제천시", 7500000, "00000000"));
        personList.add(new Employee("이경서", "1999/04/04", "서울특별시", 5000000, "11111111"));
        personList.add(new Employee("강슬기", "1994/02/10", "경기도 안산시", 4500000, "22222222"));
        personList.add(new Employee("현승희", "1996/01/25", "강원도 춘천시", 4750000, "33333333"));
        personList.add(new Employee("김지우", "1999/10/20", "서울특별시", 5500000, "44444444"));

        personList.add(new Student("김민정", "2001/01/01", "경상남도 양산시", 4.5, "2020555555"));
        personList.add(new Student("김다미", "1995/04/09", "서울특별시", 4.2, "2015666666"));
        personList.add(new Student("김다현", "1998/05/28", "경기도 성남시", 4.0, "2017777777"));
        personList.add(new Student("서현진", "1985/02/27", "서울특별시", 3.5, "2004888888"));
        personList.add(new Student("박보영", "1990/02/12", "충청북도 괴산군", 3.0, "2009999999"));

        double totalEmployeeSalary = 0;
        double totalStudentGpa = 0;

        for(Person p : personList) {
            System.out.println(p.getName());
        }
    }
}
