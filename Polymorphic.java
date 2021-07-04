package com.wkcto;

public class Polymorphic {
    public static void main(String[] args) {
        //多态
        PolyAnimal animal = new PolyAnimal();
        animal.move(); //Animal is moving!
        //向上转型：
        PolyAnimal cat = new PolyCat();
        cat.move(); //Cat is dancing!
        PolyAnimal bird = new PolyBird();
        bird.move(); //Bird is flying!
        //向下转型(子类特有的方法才需要强制转换)
        PolyAnimal catMouse = new PolyCat();
        ((PolyCat) catMouse).catchMouse();
        //
        if(catMouse instanceof PolyCat){
            ((PolyCat) catMouse).catchMouse();
        }
        System.out.println(catMouse instanceof PolyCat);
        System.out.println(bird instanceof PolyCat);
    }
}
