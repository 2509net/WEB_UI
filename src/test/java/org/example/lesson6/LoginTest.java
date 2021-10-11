package org.example.lesson6;

import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BaseTest {

    @BeforeEach
    void setupBrowser() {
        webDriver.get("https://crm.geekbrains.space/");
    }

    @Test
    @Description("Тест создания заявки на расход")
    void loginTest() {
        new LoginPage(webDriver)
                .fillLogin("Applanatest1")
                .fillPassword("Student2020!")
                .submitLogin();

        new MainPage(webDriver).navigationMenu.openNavigationSubMenuItems("Расходы");
        new ExpensesSubMenu(webDriver)
                .expensesButtonClick()
                .createExpenseButtonClick();

        new CreateExpensePage(webDriver)
                .fillExpenseAppointment("test")
                .selectBusinessUnit("Research & Development")
                .selectExpenditure("01101 - ОС: вычислительная техника инфраструктуры")
                .selectCurrency("Доллар США")
                .fillSumPlanInput("100")
                .selectPlannedDate("15")
                .saveAndCloseButtonClick();

        webDriverWait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(By.xpath("//div[@class='loader-frame well']"))));
        Assertions.assertTrue(webDriver.findElement(By.xpath("//*[.='Заявка на расход сохранена']")).isDisplayed());

        webDriver.get("https://afisha.ru");
    }

}
