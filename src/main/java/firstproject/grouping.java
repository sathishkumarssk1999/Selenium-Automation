package firstproject;

import org.testng.annotations.Test;

public class grouping {
    @Test(groups = {"smoke"})
    public void test1() {
        System.out.println("Run test 1");
    }

    @Test(groups = {"sanity"})
    public void test2() {
        System.out.println("Run test 2");
    }

    @Test(groups = {"smoke"})
    public void test3() {
        System.out.println("Run test 3");
    }

    @Test(groups = {"sanity"})
    public void test4() {
        System.out.println("Run test 4");
    }

    @Test(groups = {"smoke", "sanity"})
    public void test5() {
        System.out.println("Run test 5");
    }
}
