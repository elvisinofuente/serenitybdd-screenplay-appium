package todo.actions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInitial {

    public static Target addButton = Target.the("button [+]").located(By.id("com.vrproductiveapps.whendo:id/fab"));
    public static Target resultList =Target.the("List of tasks").located(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
}
