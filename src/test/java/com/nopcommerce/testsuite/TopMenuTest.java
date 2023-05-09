package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

   HomePage homePage;


   @BeforeMethod(alwaysRun = true)
   public void inIt(){
       homePage = new HomePage();
   }


    @Test(groups = {"sanity","regression"})
    public void verifyPageNavigation() {
        homePage.selectMenu("computer");

    }


}
