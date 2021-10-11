package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpensesPage extends BaseView {

    public ExpensesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = createExpenseButtonXpathLocator)
    public WebElement createExpenseButton;

    public void createExpenseButtonClick() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createExpenseButtonXpathLocator)));
        createExpenseButton.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CreateExpensePage.expenseAppointmentCssLocator)));
    }

    final static String createExpenseButtonXpathLocator = "//a[.='Создать заявку на расход']";
}
