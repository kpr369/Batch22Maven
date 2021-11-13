import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "Regression")
    public void test1()
    {
        System.out.println("Regression");
    }@Test(groups = "Smoke")
    public void test2()
    {
        System.out.println("Smoke");
    }
    @Test(groups = "Sanity")
    public void test3()
    {
        System.out.println("Sanity");
    }@Test(groups = "Regression")
    public void test4()
    {
        System.out.println("Regression 2");
    }
    @Test(groups = "Smoke")
    public void test5()
    {
        System.out.println("Smoke 5");
    }
    @Test(groups = {"Regression","Smoke"})
    public void test6()
    {
        System.out.println("Regression and Smoke");
    }
}
