package co.com.screenplay.tasks;

import co.com.screenplay.userinterface.ShoppingWebsite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task {
    public static Select dresses() {
        return Tasks.instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShoppingWebsite.DRESSES_BTN));
    }
}
