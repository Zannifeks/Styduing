package lesson22.homework;

public class Tiger extends Cat {
    public Tiger(String name) {
        super(name);
    }

    public void roar() {
        System.out.println("Makes roar...");
    }
    protected int size = 120;
}
