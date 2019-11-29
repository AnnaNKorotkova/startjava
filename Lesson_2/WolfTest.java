public class WolfTest {

    public static void main(String[] args) {
        Wolf someWolf = new Wolf();
        someWolf.gender = "maleDog";
        someWolf.nickname = "Pixel";
        someWolf.weight = 24.3F;
        someWolf.age = 6;
        someWolf.color = "gray";

        System.out.println("Пол: " + someWolf.gender);
        System.out.println("Кличка: " + someWolf.nickname);
        System.out.println("Вес: " + someWolf.weight + " кг");
        System.out.println("Возраст: " + someWolf.age + " лет");
        System.out.println("Окрас: " + someWolf.color);

        someWolf.walk();
        System.out.print(someWolf.sit() + " ");
        someWolf.sit();
        someWolf.run();
        someWolf.howl();
        someWolf.hunt();
    }
}