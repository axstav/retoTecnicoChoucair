package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theNewExperienceSignInPage() {
        return Task.where("{0} opens the NewExperience sign in page",
                Open.browserOn().the(NewExperienceSignInPage.class)
        );
    }

}