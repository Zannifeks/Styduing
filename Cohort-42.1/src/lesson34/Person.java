package lesson34;

public class Person implements Comparable<Person>{


    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Person p) {
        //В классике
        return name.compareTo(p.name);
        //В обратном направлении
        //return  p.name.compareTo(name);
    }
}
