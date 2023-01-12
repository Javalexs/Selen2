import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionTest {
    @Test
    void checkGit() {
        open("https://github.com/");
        Configuration.holdBrowserOpen = true;
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".font-mktg").shouldHave(text("Build like the best"));
    }



}
