package lesson15;

public class Cat {
    String name;
    String colour;
    int age;
    int volume;
    int food;

    public Cat(String name, String colour, int age, int volume) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.volume = volume;
    }

//    int energy;
//
//    public void walk() {
//        energy -= 3;
//    }
//
    public void eat(int food) {
        this.food = food;
    }

    public double wellFed() {
        return (double) food / volume * 100;
    }
    public void voice() {
        System.out.println("Meow!");
    }
}
