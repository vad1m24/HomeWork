package lesson6;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void running (int run){
        System.out.printf("%s пытается пробежать %d метров\n", name, run);
    }

    public void swimming (int swim){
        System.out.printf("%s пытается проплыть %d метров\n", name, swim);
    }
}
