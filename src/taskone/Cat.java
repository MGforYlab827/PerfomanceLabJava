package taskone;

public class Cat extends Animal {
    private String name = null;

    public Cat(String name) {
        this();
        this.name = name;
    }
    public Cat() {
        super(200, 0);
    }

    @Override
    public void run(int length) {
        if(length > getMaxRunLength()) {
            throw new IllegalArgumentException("Length should be less then maxRunLength (maxRunLength = " + getMaxRunLength() + ")");
        }
        if(name == null) {
            System.out.println("Кот пробежал " + length + " м");
        } else {
            System.out.println(name + " пробежал " + length + " м");
        }
    }

    @Override
    public void swim(int length) {
        if (length > getMaxSwimLength()) {
            throw new IllegalArgumentException("Length should be less then maxSwimLength (maxSwimLength = " + getMaxSwimLength() + ")");
        }
        if(name == null) {
            System.out.println("Кот не умеет плавать");
        } else {
            System.out.println(name + " не умеет плавать ");
        }
    }
}
