import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {

    public static void main(String[] args) {
        int[] arrayVariable = new int[10];
        for (int i = 0; i < 10; ++i) {
            arrayVariable[i] = i / 2;
            arrayVariable[i]++;
            System.out.print(arrayVariable[i] + "A ");
            i++;
        }

    }
}
