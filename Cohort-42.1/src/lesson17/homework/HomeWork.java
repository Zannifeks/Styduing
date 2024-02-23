package lesson17.homework;

public class HomeWork {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("a1", "b1", "e1", "t1", 1000, 40),
                new Employee("a2", "b2", "e2", "t2", 1200, 42),
                new Employee("a3", "b3", "e3", "t3", 800, 37)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
//                System.out.println(employee.getName() +  ", " +
//                        employee.getPosition() + ", " +
//                        employee.getEmail() + ", " +
//                        employee.getPhone() + ", " +
//                        employee.getSalary() + ", " +
//                        employee.getAge());
            }
        }
    }
}
