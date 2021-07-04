package com.wkcto;

public class PolymorphicTest {
    public static void main(String[] args) {
        PolyMaster zhangsan = new PolyMaster();
        PolyAnimal wangcai = new PolyDog();
        PolyAnimal xiaohei = new PolyCat();
        PolyAnimal yingwu = new PolyBird();
        zhangsan.feed(wangcai);
        zhangsan.feed(xiaohei);
        zhangsan.feed(yingwu);
    }
}
