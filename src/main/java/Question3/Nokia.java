package Question3;

public class Nokia implements Phone {


    public String simcard() {

        return "Nano";
    }

    @Override
    public String camera() {

        return "Rear";
    }

    @Override
    public String config() {
        return "This Nokia Configuration";
    }

    /*public void config(){
        System.out.println("Trin-trin");
    }*/
}
