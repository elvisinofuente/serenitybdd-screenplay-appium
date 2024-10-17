package steps;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import todo.actions.AddTask;
import todo.actions.PageInitial;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepsToDo {
    private static boolean stageInitialized = false;
    @Before
    public void beforeCucumber(){
        if (!stageInitialized) {
            OnStage.setTheStage(new OnlineCast());
            stageInitialized = true;
        }
    }
    /*@Managed(driver="appium")
    public WebDriver mobile;*/

    @Given("{actor} tiene acceso a whenDoApp")
    public void tomasTieneAccesoAWhenDoApp(Actor actor) {

    }

    @When("{actor} crea una nueva tarea con titulo {word} y descripcion {word}")
    public void elCreaUnaNuevaTareaConTituloTituloYDescripcionDescripcion(Actor actor, String titulo, String descripcion) {
        actor.attemptsTo(Click.on(PageInitial.addButton));
        actor.attemptsTo(SendKeys.of(titulo).into(AddTask.titleTxtBox));
        actor.attemptsTo(SendKeys.of(descripcion).into(AddTask.noteTxtBox));
        actor.attemptsTo(Click.on(AddTask.saveButton));
    }

    @Then("{actor} espera que la tarea {word} haya sido creada")
    public void elEsperaQueLaTareaTituloHayaSidoCreada(Actor actor, String titulo) {
        actor.should(seeThat("Validar el titulo", Text.of(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")), equalTo(titulo)));
    }

    @ParameterType(".*")
    public Actor actor(String name){
        return OnStage.theActorCalled(name);
    }
}
