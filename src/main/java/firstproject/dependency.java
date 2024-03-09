package firstproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {

    @Test
    void startCar() {
        System.out.println(" Start Car ");
    }

    @Test(dependsOnMethods = "startCar")
    void driverCar() {
        System.out.println(" driver Car ");
    }

    @Test(dependsOnMethods = "driverCar")
    void fastCar() {
        System.out.println(" fast Car ");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "fastCar")
    void stopCar() {
        System.out.println(" stop Car ");
        Assert.fail();

    }
}
