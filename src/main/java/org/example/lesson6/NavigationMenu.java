package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavigationMenu extends BaseView {

    ExpensesSubMenu expensesSubMenu;

    public NavigationMenu(WebDriver webDriver) {
        super(webDriver);
        expensesSubMenu = new ExpensesSubMenu(webDriver);
    }

    @FindBy(xpath = "//ul[@class='nav nav-multilevel main-menu']/li")
    public List < WebElement > navigationMenuItems;

    public void openNavigationSubMenuItems(String menuName) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(navigationMenuItems.stream().filter(element -> element.getText().equals(menuName))
                .findFirst().get()).build().perform();
        new ExpensesSubMenu(webDriver);
    }
}
