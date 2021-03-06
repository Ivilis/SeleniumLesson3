package Steps;
import Pages.TravelInsurance2step;
import ru.yandex.qatools.allure.annotations.Step;
import com.sun.tools.javac.*;
import java.util.HashMap;

public class TravelInsurance2Steps extends BaseSteps{

    @Step("Выбран тип гражданства - {0}")
    public void stepChooseCitizenship (String citizenornot) {
        new TravelInsurance2step(BaseSteps.getDriver()).chooseCitezenship(citizenornot);
    }

    @Step("Выбран пол - {0}")
    public void stepChooseGender (String gender) {
        new TravelInsurance2step(BaseSteps.getDriver()).chooseGender(gender);
    }

    @Step("Поле {0} заполнено значением - {1}")
    public void stepFillField (String field, String value) {
        new TravelInsurance2step(BaseSteps.getDriver()).fillOurPainFields(field, value);
    }

    @Step("Заполняются поля:")
    public void stepFillAllFields (HashMap<String,String> fields) {
        fields.forEach(this::stepFillField);
    }

    @Step("Проверка заполнений: поле - {0} - имеет значение - {1}")
    public void stepCheckField (String fieldToCheck, String expectedValue) {
        new TravelInsurance2step(BaseSteps.getDriver()).checkThemPay(fieldToCheck, expectedValue);
    }

    @Step("Проверка всех полей")
    public void stepCheckAllFields (HashMap<String,String> fields) {
        fields.forEach(this::stepCheckField);
    }

    @Step("Нажата кнопка - Продолжить")
    public void stepContinueButtonClick () {
        new TravelInsurance2step(BaseSteps.getDriver()).continueButton.click();
    }

    @Step("Выведено сообщение об обязательности заполнения ключевых полей")
    public void stepCheckErrorMessage (String errorMessage) {
        new TravelInsurance2step(BaseSteps.getDriver()).checkErrorMessage(errorMessage);
    }
}
