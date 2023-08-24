package taskone;

public class Animal {
    private final int maxRunLength;
    private final int maxSwimLength;

    public Animal(int maxRunLength, int maxSwimLength) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }

    public void swim(int length) {
        if (length > maxSwimLength) {
            throw new IllegalArgumentException("Length should be less then maxSwimLength (maxSwimLength = " + getMaxSwimLength() + ")");
        }
        System.out.println("Животное проплыло " + length + " м.");
    }

    public void run(int length) {
        if(length > maxRunLength) {
            throw new IllegalArgumentException("Length should be less then maxRunLength (maxRunLength = " + getMaxRunLength() + ")");
        }
        System.out.println("Животное пробежало " + length + " м.");
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }
}
