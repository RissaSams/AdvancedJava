package advanceEmp;

class Employee {

    double salary = 40000;

}

class Programmer  extends Employee{
    double bonus = 100000;

    public static void main(String[] args) {

        Programmer kura = new Programmer();
        System.out.println("Programer salary is: " + kura.salary);
        System.out.println("Programer bonus is: " + kura.bonus);
    }
}
