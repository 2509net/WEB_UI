package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpensesSubMenu extends BaseView {

    @FindBy(xpath = "//span[.='Заявки на расходы']")
    public WebElement createExpenseButton;

    public ExpensesSubMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public ExpensesPage expensesButtonClick() {
        createExpenseButton.click();
        return new ExpensesPage(webDriver);
    }
}
