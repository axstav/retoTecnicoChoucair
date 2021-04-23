package starter.register;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ClickCreateAccount {
    public static Performable clickButton() {
        return Task.where("{0} attempts to register email account click button",
                Click.on(EmailAccountForm.CREATE_ACCOUNT_BUTTON)
        );
    }
}
