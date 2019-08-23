package co.com.screenplay.tasks;

import co.com.screenplay.userinterface.ShoppingWebsite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Open implements Task {

    private ShoppingWebsite shoppingWebsite;

    public static Open webPage() {
        return Tasks.instrumented(Open.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(shoppingWebsite));
    }
}
