import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Act {
    @Test
    void moveRectangle(){
        //Запустить браузер Google и в нем открыть сайт the-internet.herokuapp.com
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Configuration.holdBrowserOpen = true;

        //Поменять прямоугольники местами и проверить
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b header").shouldHave(text("A"));
        $("#column-a header").shouldHave(text("B"));
    }

}
