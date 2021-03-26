
package Lesson22_Incaps;


public class Animal {
    Animal(){System.out.println("I am animal");}
    public int eyes;
    public void eat(){System.out.println ("animals eat");}
    public void drink(){System.out.println("animals drink");}
    
}
class Pet extends Animal{
    Pet(){
        System.out.println("I am pet");
        this.eyes=2;
    }
    String name;
    int tail=1;
    int paw=4;
    public void run(){System.out.println("Pets ran");}
    public void jump(){System.out.println("Pet jumps");}
}
class Dog extends Pet{
    Dog(String n){
        name=n;
        System.out.println("I am dog and my name is: "+name);
    }
    public void play(){System.out.println("Dog plays");}
    
}
class Cat extends Pet{
    Cat(String n){
        name=n;
        System.out.println("I am cat and my name is: "+name);
    }
    public void sleep(){System.out.println("Cat sleeps");}
}
class Test5{
    public static void main(String[] args) {
    Dog sharik=new Dog("Sharik");
        System.out.println(sharik.paw);
        Cat murka = new Cat("Murka");
        murka.sleep();
    }
}
