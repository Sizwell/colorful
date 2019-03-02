package Question3;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    public String simcard() {

        return "Micro";
    }


    public String camera() {
        return "Dual";
    }

    @Autowired
    Phone ph;

    public Phone getPh() {
        return ph;
    }

    public void setPh(Phone ph) {
        this.ph = ph;
    }

    public String config(){
        ph.config();
        return "This is a Configuration for Samsung";

    }

}
