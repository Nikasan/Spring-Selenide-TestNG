package simpletestngspringtests;

import base.BaseTest;
import com.bwielk.testngspring.testngspring.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

//@SpringBootTest(classes = TestngspringApplication.class) Нужна ли тут аннотация??
public class SearchFeatureTest extends BaseTest {

    @Autowired
    private HomePage homePage;

    @Autowired
    private HomePage homePage1;

    @Test
    private void homePagePromoContentIsDisplayedCorrectly(){
      homePage.openHomePage();
      homePage.inputSearch("TestNG");
    }

    @Test
    private void userCanSearchACarByPrice(){
        homePage.openHomePage();
        homePage.inputSearch("TestNG");

    }

    @Test
    private void homePagePromoContentIsDisplayedCorrectly2() {
        homePage.openHomePage();
        homePage.inputSearch("TestNG");
    }
}
