package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReaderDataFromJson;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest {
    ReaderDataFromJson readeDataFromJson;

   /* @Test
    public void t1() throws FileNotFoundException {
         readeDataFromJson=new ReaderDataFromJson();
         System.out.println(readeDataFromJson.raedJsonFile().URL);
        System.out.println(readeDataFromJson.raedJsonFile().Login.vaildcreadentionls.username);
        System.out.println(readeDataFromJson.raedJsonFile().Login.vaildcreadentionls.password);
        System.out.println(readeDataFromJson.raedJsonFile().Login.Invaildcreadentionls.Invaildusername.username);
        System.out.println(readeDataFromJson.raedJsonFile().Login.Invaildcreadentionls.Invaildusername.password);

        System.out.println(readeDataFromJson.raedJsonFile().Login.Invaildcreadentionls.Invaildpassword.username);
        System.out.println(readeDataFromJson.raedJsonFile().Login.Invaildcreadentionls.Invaildpassword.password);

    }*/ 
    @Test
    public void testSucessfuallLogin() throws FileNotFoundException {
        readeDataFromJson=new ReaderDataFromJson();

        LoginPage loginPage= homePage.ClickOnLoginLink();
   loginPage.insertUsername(readeDataFromJson.raedJsonFile().Login.vaildcreadentionls.username);
   loginPage.insertPassword(readeDataFromJson.raedJsonFile().Login.vaildcreadentionls.password);
   loginPage.clickOnLoginButton();

    }
}
