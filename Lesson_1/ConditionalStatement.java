public class ConditionalStatement {
    public static void main(String[] arg) {
        int age = 30;
        boolean isMale = true;
        double hight = 2.00;
        String name = "Ivan";

        if (age < 20) {
        System.out.println ("You are too young to drink.");
        }
        
        if (isMale) {
            System.out.println ("Where are you going? It's a Lady's room");
        }

        if (!isMale) {
            System.out.println ("Easy tiger. I drink only coffee");
        }
        
        if (hight < 1.80) {
            System.out.println ("Hey, dude. Stop crying");
        } else {
            System.out.println ("Look at you, Lofty! ");
        }

        if (name.charAt(0) == 'M') {
            System.out.println ("Misha, is it you?");
        } else if (name.charAt(0) == 'I') {
            System.out.println ("Come out, Ivan, whatever you are");
        } else {
            System.out.println ("Stop freaking me out. Get out of here, I don't know you");
        }
    }
}