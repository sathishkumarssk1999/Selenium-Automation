package firstproject;

import org.testng.annotations.Test;

public class firstJavaProject {

    @Test(priority = 2)
    void setup() {
        System.out.println(" I am inside setup");
    }

    @Test(priority = 1)
    void test() {
        System.out.println(" I am inside test");
    }

    @Test(priority = 3)
    void sample() {
        System.out.println(" I am inside sample");
    }

    @Test(alwaysRun = true)
    void alwaysRun() {
        System.out.println(" I am always run");
    }

    @Test(enabled = false)
    void enable() {
        System.out.println(" I am enabled");
    }

    @Test
    void description() {
        System.out.println(" I am description");
    }

}

