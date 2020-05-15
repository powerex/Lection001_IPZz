public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
        super();
    }

    public void wow() {
        for (int i = 0; i < age; ++i) {
            System.out.println(name + " Wow");
        }
    }

    public void scare(Cat cat) {
        cat.loseLive();
    }

    @Override
    public void showInfo() {
        System.out.println("This is dog ");
    }

}
