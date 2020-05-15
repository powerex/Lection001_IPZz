public class Application {

    public static void main(String[] args) {
        System.out.println("Hello");

        int n = 12;
        Dog dog1 = new Dog("Sharik", 3);
//        dog1.wow();
        dog1.getAge();

        Dog dog2 = new Dog("Bobik", 5);
        dog2.setName("Tyzik");
//        dog2.wow();

        Cat cat1 =  new Cat("Myrka", 2);
        Cat cat2 =  new Cat("Vaska", 3);

        dog1.scare(cat1);
        dog1.scare(cat2);

        System.out.println(cat1.getLives());
        System.out.println(cat2.getLives());


    }

}
