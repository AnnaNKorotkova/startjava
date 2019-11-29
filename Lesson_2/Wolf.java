public class Wolf {

    String gender;
    String nickname;
    float weight;
    int age;
    String color;

    void walk() {
        System.out.println("Иду-бреду не знаю куда");
    }

    boolean sit() {
        System.out.println("А куда мнеб собственно торопиться?");
        return true;
    }

    void run() {
        System.out.println("Пойдем со мной, там много вкусного!");
    }

    void howl() {
        System.out.println("Jav-jav-jaaavaaa!!!");
    }

    void hunt() {
        System.out.println("Чем больше посижу, тем больше наловлю!");
    }
}