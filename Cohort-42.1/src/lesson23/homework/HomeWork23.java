package lesson23.homework;

/**
 * AIT-TR, cohort 42.1, Java Basic, Homework #23
 *
 * @author Shilinski Rodion
 * @version 13-Mar-24
 */
public class HomeWork23 {
    public static void main(String[] args) {
        Product laptop = new Product("Lenovo T590", 1000);
        Product tv = new Product("Samsung 34'", 800);

        Manager manager = new Manager();

        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse);

        ToWarehouse toWarehouse = new ToWarehouse(1);
        toWarehouse.add(laptop, 50);
        toWarehouse.add(tv, 50);
        toWarehouse.toWarehouse(warehouse, manager);
        System.out.println(warehouse);

        toWarehouse.toWarehouse(warehouse, manager);
        System.out.println(warehouse);

        Order order = new Order(2);
        order.add(laptop, 60);
        order.add(tv, 5);

        FromWarehouse fromWarehouse = new FromWarehouse(3);
        fromWarehouse.add(order);
        fromWarehouse.fromWarehouse(warehouse);
        System.out.println(warehouse);
    }
}