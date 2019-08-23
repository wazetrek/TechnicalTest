package co.com.screenplay.questions;

import co.com.screenplay.userinterface.ShoppingWebsite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Response implements Question<String> {
    public static Response succesfully() {
        return new Response();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ShoppingWebsite.SUCCESFULL_PURCHASE).viewedBy(actor).asString();
    }
}
