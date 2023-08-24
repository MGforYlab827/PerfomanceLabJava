package taskone;

public class Dog extends Animal {
    private String name = null;

    public Dog() {
        super(500, 10);
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    @Override
    public void run(int length) {
        if(length > getMaxRunLength()) {
            throw new IllegalArgumentException("Length should be less then maxRunLength (maxRunLength = " + getMaxRunLength() + ")");
        }
        if(name == null) {
            System.out.println("Пёс пробежал " + length + " м");
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
            System.out.println("Пёс проплыл " + length + " м");
        } else {
            System.out.println(name + " проплыл " + length + " м");
        }
    }
}
