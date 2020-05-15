import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        final int MAX = 10;
        Random generator = new Random();

        Animal[] animalArray = new Animal[MAX];

        for (int i=0; i<MAX; ++i) {
            if (generator.nextDouble() < 0.5)
                animalArray[i] = new Dog();
            else
                animalArray[i] = new Cat();
        }

        for (int i=0; i<MAX; ++i) {
            animalArray[i].showInfo();
        }

    }

}
