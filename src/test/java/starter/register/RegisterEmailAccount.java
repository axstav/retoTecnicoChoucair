package starter.register;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterEmailAccount {

    public static Performable term(String term) {
        return Task.where("{0} attempts to register email account #term",
                Clear.field(EmailAccountForm.EMAIL_FIELD),
                Enter.theValue(term).into(EmailAccountForm.EMAIL_FIELD)
                //,Click.on(EmailAccountForm.)
        ).with("term").of(term);
    }

}
