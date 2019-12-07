package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerGipsyDanger = new Jaeger();
        jaegerGipsyDanger.setModelName("Gipsy Danger");
        jaegerGipsyDanger.setMark("Mark-3");
        jaegerGipsyDanger.setOrigin("USA");
        jaegerGipsyDanger.setHeight(79.25F);
        jaegerGipsyDanger.setWeight(1980.0F);
        jaegerGipsyDanger.setSpeed(7);
        jaegerGipsyDanger.setStrenght(8);
        jaegerGipsyDanger.setArmor(6);

        Jaeger jaegerChernoAlpha = new Jaeger();
        jaegerChernoAlpha.setModelName("Cherno Alpha");
        jaegerChernoAlpha.setMark("Mark-1");
        jaegerChernoAlpha.setOrigin("Russia");
        jaegerChernoAlpha.setHeight(85.34F);
        jaegerChernoAlpha.setWeight(2412.0F);
        jaegerChernoAlpha.setSpeed(3);
        jaegerChernoAlpha.setStrenght(10);
        jaegerChernoAlpha.setArmor(10);

        jaegerChernoAlpha.move();

        jaegerGipsyDanger.scanKaiju();

        if (jaegerChernoAlpha.drift()){
            System.out.println("И слилИсь они в одном танце");
        } else {
            System.out.println("Упс");
        }
    }
}