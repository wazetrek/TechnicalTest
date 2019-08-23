package co.com.screenplay.tasks;

import co.com.screenplay.userinterface.ShoppingWebsite;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AddCart implements Task {

    private double maxValue = 0;
    private int lastPos;

    public static AddCart dress() {
        return Tasks.instrumented(AddCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> spans = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//div[@class='left-block']//div[@class='content_price']/span[@class='price product-price']"));
        for (int i = 0; i < spans.size(); i++) {
            String[] realValue = spans.get(i).getAttribute("innerHTML").trim().split("[$]", 0);
            for (String value: realValue) {
                if((value != null && !value.isEmpty()) && (Double.parseDouble(value) > maxValue)) {
                    maxValue = Double.parseDouble(value);
                    lastPos = i;
                }
            }
        }
        List<WebElement> aa = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//div[@class='right-block']//a[@class=\"product-name\"]"));
        aa.get(lastPos).click();

        actor.attemptsTo(Click.on(ShoppingWebsite.ADD_CART_BTN));
        actor.attemptsTo(Click.on(ShoppingWebsite.PROCEED_TO_CHECKOUT));
        actor.attemptsTo(Click.on(ShoppingWebsite.PROCEED_TO_CHECKOUT_IN_CART));
        actor.attemptsTo(Enter.theValue("aaa1@gmail.com").into(ShoppingWebsite.EMAIL));
        actor.attemptsTo(Enter.theValue("ppusuario").into(ShoppingWebsite.PASSWORD));
        actor.attemptsTo(Click.on(ShoppingWebsite.SUBMIT_LOGIN));
        actor.attemptsTo(Click.on(ShoppingWebsite.PROCEED_TO_CHECKOUT_ADDRESESS));
        actor.attemptsTo(Click.on(ShoppingWebsite.TERMS_CHK));
        actor.attemptsTo(Click.on(ShoppingWebsite.PROCEED_TO_CHECKOUT_SHIPPING));
        actor.attemptsTo(Click.on(ShoppingWebsite.PAY_BY_BANK_WIRE));
        actor.attemptsTo(Click.on(ShoppingWebsite.CONFIRM_ORDER_BTN));
    }
}
