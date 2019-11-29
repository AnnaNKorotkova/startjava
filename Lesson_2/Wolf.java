public class Wolf {

    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорретный возраст (строват ты батенька)");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Иду-бреду не знаю куда");
    }

    public boolean sit() {
        System.out.println("А куда мнеб собственно торопиться?");
        return true;
    }

    public void run() {
        System.out.println("Пойдем со мной, там много вкусного!");
    }

    public void howl() {
        System.out.println("Jav-jav-jaaavaaa!!!");
    }

    public void hunt() {
        System.out.println("Чем больше посижу, тем больше наловлю!");
    }
}