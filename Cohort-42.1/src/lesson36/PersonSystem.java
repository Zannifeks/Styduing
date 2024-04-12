package lesson36;

import java.util.Scanner;

public class PersonSystem {

    public static void main(String[] args) {
        Persons persons = new Persons();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple personal system");
        char operation;
        do {
            System.out.println("Enter operation (a[dd],d[elete],u[pdate],[f]ind,p[rint],x - exit): ");
            operation = scanner.next().charAt(0);
            switch (operation) {
                case 'a':
                    System.out.println("Add: name & age: ");
                    String name = scanner.next();
                    int age = scanner.nextInt();
                    persons.add(name,age);
                    break;
                case 'd':
                    System.out.print("Delete: id: ");
                    int id = scanner.nextInt();
                    persons.delete(id);
                    break;
                case 'u':
                    System.out.println("Update: id & name & age");
                    id = scanner.nextInt();
                    name = scanner.next();
                    age = scanner.nextInt();
                    persons.update(id, name, age);
                    break;
                case 'p':
                    System.out.println(persons);
                    break;
                case 'f':
                    System.out.println("Find: id: ");
                    id = scanner.nextInt();
                    System.out.println(persons.find(id));
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Undefined operation: " + operation);
            }
        } while (operation != 'x');
    }
}
