package online.blackwidow.thorntaildemo.cdi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestCDI {

    public String getMessage() {
        return "Special message from: " + TestCDI.class.getSimpleName();
    }
}
