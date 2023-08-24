package taskone;

public class Tiger extends Animal {
    private String name = null;

    public Tiger() {
        super(1000, 200);
    }

    public Tiger(String name) {
        this();
        this.name = name;
    }

    @Override
    public void run(int length) {
        if(length > getMaxRunLength()) {
            throw new IllegalArgumentException("Length should be less then maxRunLength (maxRunLength = " + getMaxRunLength() + ")");
        }
        if(name == null) {
            System.out.println("Тигр пробежал " + length + " м");
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
            System.out.println("Тигр проплыл " + length + " м");
        } else {
            System.out.println(name + " проплыл " + length + " м");
        }
    }
}
