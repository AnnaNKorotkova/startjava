package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.modelName = modelName;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println ("Полетели туда, там много вкусного");
    }

    public String scanKaiju() {
        System.out.println("Ну ка посмотрим");
        return "Чисто, можно двигаться";
    }

    public void useVortexCannon() {
        System.out.println("Тыдыщ");        
    }
}