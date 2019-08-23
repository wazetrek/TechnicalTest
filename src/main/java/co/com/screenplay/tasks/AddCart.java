package co.com.screenplay.tasks;

import co.com.screenplay.userinterface.ShoppingWebsite;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddCart implements Task {

    private double maxValue = 0;
    public static AddCart dress() {
        return Tasks.instrumented(AddCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> allDresses = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//div[@class='right-block']//div[@class='content_price']/span[@class='price product-price']"));
        for (int i = 0; i < allDresses.size(); i++) {
            String[] realValue = allDresses.get(i).getAttribute("innerHTML").trim().split("[$]", 0);
            for (String value: realValue) {
                if(value != null && !value.isEmpty()) {
                    if (Double.parseDouble(value) > maxValue) {
                        maxValue = Double.parseDouble(value);

                    }
                }
            }
        }
    }
}
