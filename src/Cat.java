public class Cat extends Animal {

    private int lives;

    public Cat(String name, int age) {
        super(name, age);
        lives = 9;
    }

    public Cat() {
        super();
    }

    public void loseLive() {
        lives--;
    }

    public int getLives() {
        return lives;
    }

    @Override
    public void showInfo() {
        System.out.println("This is cat ");
    }
}
