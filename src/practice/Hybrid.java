package practice;

interface Animalsss {
    void eat();
}

interface Pets extends Animalsss {
    void play();
}

class Dogsss implements Pet {
    public void eat() {
        System.out.println("Dog eats food");
    }
    public void play() {
        System.out.println("Dog plays with ball");
    }
}

public class Hybrid {
    public static void main(String_Demo1[] args) {
        Dogsss dss = new Dogsss();
        dss.eat();
        dss.play();
    }
}
