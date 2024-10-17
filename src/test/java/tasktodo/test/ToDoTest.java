package tasktodo.test;


import net.thucydides.core.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import todo.actions.AddTask;
import todo.actions.PageInitial;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


@ExtendWith(SerenityJUnit5Extension.class)
public class ToDoTest {
    /*@Managed(driver="Appium")
    public WebDriver hisMobileDevice;

    @BeforeEach
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }
    @AfterEach
    public void after(){

    }
    @Test
    public void addTask(){
        theActorCalled("Tomas").attemptsTo(Click.on(PageInitial.addButton));
        theActorInTheSpotlight().attemptsTo(SendKeys.of("titulo").into(AddTask.titleTxtBox));
        theActorInTheSpotlight().attemptsTo(SendKeys.of("nota").into(AddTask.noteTxtBox));
        theActorInTheSpotlight().attemptsTo(Click.on(AddTask.saveButton));


    }*/
}
