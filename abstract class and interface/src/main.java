public class main {
    public static void main(String args[]){
        Person student = new Employee("Raphael","Female",69);
        Person employee = new Employee("Christopher","Male",123);
        student.work();
        employee.work();
        employee.changeName("nutbuster69");
        System.out.println(employee.toString());
        employee.eat();
        employee.breath();
    }
}
