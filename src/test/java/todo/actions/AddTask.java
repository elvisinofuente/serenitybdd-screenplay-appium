package todo.actions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTask {

    public static Target titleTxtBox = Target.the ("tittle").located(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public static Target  noteTxtBox = Target.the ("note").located(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));

    public static Target  saveButton = Target.the ("button save").located(By.xpath("//android.widget.TextView[@content-desc='Save']"));
}
