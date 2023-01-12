import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Act {
    @Test
    void moveRectangle(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Configuration.holdBrowserOpen = true;

        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b header").shouldHave(text("A"));
        $("#column-a header").shouldHave(text("B"));
    }

}
