package animal;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    final public void voice() {
        System.out.println("Some sound");
    }

    protected void eat() {
        System.out.println("Animal eating");
    }

    public String getName() {
        return name;
    }
}
