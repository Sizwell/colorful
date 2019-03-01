package Question2;

public class Snake implements Reptiles{


    @Override
    public String move() {
        return "Slither";
    }

    @Override
    public String eat() {
        return "Frogs";
    }
}
