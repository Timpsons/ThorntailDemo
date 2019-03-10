package online.blackwidow.thorntaildemo.ejb;

import javax.ejb.Stateless;

@Stateless
public class TestEJB {

    public String getMessage() {
        return "Special message from: " + TestEJB.class.getSimpleName();
    }
}
