import org.testng.annotations.Test;

public class TestNGDemo {


    @Test(priority = 1)  //Testcase
    public void loginPage()
    {
        System.out.println(5/0);
    }

    @Test(dependsOnMethods = "loginPage",alwaysRun = true)
    public void homePage() throws InterruptedException {
        System.out.println("Home");
        Thread.sleep(1000);
    }
}
