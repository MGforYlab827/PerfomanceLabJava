package taskone;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String... args) {
        Animal[] animals = new Animal[] {new Tiger(), new Cat(), new Dog(), new Cat("Sam"), new Dog("Patric")};
        Random random = new Random();
        int length;
        for(Animal animal : animals) {
            length = random.nextInt(1000) + 1;
            try {
                animal.run(length);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            try {
                animal.swim(length);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
        System.out.println("Массив animal содержит следущие виды: ");
        countAnimalsMap(animals).entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    private static Map<String, Integer> countAnimalsMap(Animal[] animals) {
        Map<String, Integer> animalsMap = new HashMap<>();
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                animalsMap.put(Cat.class.getName(), animalsMap.getOrDefault(Cat.class.getName(), 0) + 1);
            } else if (animal instanceof Dog) {
                animalsMap.put(Dog.class.getName(), animalsMap.getOrDefault(Dog.class.getName(), 0) + 1);
            } else if (animal instanceof Tiger) {
                animalsMap.put(Tiger.class.getName(), animalsMap.getOrDefault(Tiger.class.getName(), 0) + 1);
            } else {
                animalsMap.put(Animal.class.getName(), animalsMap.getOrDefault(Animal.class.getName(), 0) + 1);
            }
        }
        return animalsMap;
    }
}
