package com.wkcto;

public class PolyMaster {
    public void feed(PolyAnimal animal){
        if (animal instanceof PolyDog){
            ((PolyDog)animal).dogEating();
        }else if (animal instanceof PolyCat){
            ((PolyCat)animal).catEating();
        }else if (animal instanceof PolyBird){
            ((PolyBird) animal).birdEating();
        }
    }
}
