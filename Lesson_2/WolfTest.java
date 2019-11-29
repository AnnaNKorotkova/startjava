public class WolfTest {

    public static void main(String[] args) {
        Wolf someWolf = new Wolf();
        
        someWolf.setGender("maleDog");
        someWolf.setNickname ("Pixel");
        someWolf.setWeight (24.3F);
        someWolf.setAge(12);
        someWolf.setColor ("gray");

        System.out.println("Пол: " + someWolf.getGender());
        System.out.println("Кличка: " + someWolf.getNickname());
        System.out.println("Вес: " + someWolf.getWeight() + " кг");
        System.out.println("Возраст: " + someWolf.getAge() + " лет");
        System.out.println("Окрас: " + someWolf.getColor());
    }
}