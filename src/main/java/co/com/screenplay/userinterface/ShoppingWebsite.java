package co.com.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class ShoppingWebsite extends PageObject {

    public static final Target DRESSES_BTN = Target
            .the("Botón que direcciona a la sección de vestidos")
            .located(By.xpath("//div/ul/li/a[@title=\"Dresses\"]"));

    public static final Target DRESSES_LIST = Target
            .the("Lista de vestidos disponibles")
            .located(By.className("product_list grid row"));

    public static final Target ADD_CART = Target
            .the("Botón que agrega el elemento al carrito de compras")
            .located(By.xpath("//*[@data-id-product=\"4\" and starts-with(@class, \"button\")]"));

    public static final Target SEND_DRESS_PAGE = Target
            .the("Indicador para redireccionar a la página del vestido")
            .located(By.id("bigpic"));

    public static final Target PROCEED_TO_CHECKOUT = Target
            .the("Botón para proceder a realizar la compra del carrito cargado")
            .located(By.cssSelector("a[title=\"Proceed to checkout\"]"));

    public static final Target PROCEED_TO_CHECKOUT_IN_CART = Target
            .the("Botón para dar siguiente cuando se está en el carro")
            .located(By.className("button btn btn-default standard-checkout button-medium"));

    public static final Target STEP_CART = Target
            .the("¨Paso actual en el que se encuentra el carrito")
            .located(By.className("page-heading"));

    public static final Target EMAIL = Target
            .the("Email de usuario")
            .located(By.id("email"));

    public static final Target PASSWORD = Target
            .the("PASSWORD de usuario")
            .located(By.id("passwd"));

    public static final Target SUBMIT_LOGIN = Target
            .the("Botón para realizar login")
            .located(By.id("SubmitLogin"));

    public static final Target PROCEED_TO_CHECKOUT_ADDRESESS = Target
            .the("Botón para pasar al siguiente paso cuando se esta seleccionado la dirección")
            .located(By.name("processAddress"));

    public static final Target ADD_CART_BTN = Target
            .the("Botón para agregar el vestido al carro")
            .located(By.xpath("//p[@id=\"add_to_cart\"]/button"));

    public static final Target TERMS_CHK = Target
            .the("Botón check para aceptar los terminos de servicio")
            .located(By.id("cgv"));

    public static final Target PROCEED_TO_CHECKOUT_SHIPPING = Target
            .the("Botón para pasar al siguiente paso cuando se esta seleccionado el envío")
            .located(By.name("processCarrier"));

    public static final Target PAY_BY_BANK_WIRE = Target
            .the("Botón para realizar el pago por trasnferencia bancaria")
            .located(By.className("bankwire"));

    public static final Target CONFIRM_ORDER_BTN = Target
            .the("Botón para confirmar la orden")
            .located(By.className("button btn btn-default button-medium"));

}
