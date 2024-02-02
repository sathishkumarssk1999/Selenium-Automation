package firstproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {

    @Test
    void startcar() {
        System.out.println(" Start Car ");
    }

    @Test(dependsOnMethods = "startcar")
    void drivercar() {
        System.out.println(" driver Car ");
    }

    @Test(dependsOnMethods = "drivercar")
    void fastcar() {
        System.out.println(" fast Car ");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "fastcar")
    void stopcar() {
        System.out.println(" stop Car ");
        Assert.fail();

    }
}
