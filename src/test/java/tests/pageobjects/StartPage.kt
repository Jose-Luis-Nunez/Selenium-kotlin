package tests.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.annotation.PageUrl
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.support.FindBy

@PageUrl("http://github.com") // specifies getUrl()
@FindBy(css=".enterprise-prompt") // specifies isAt()
open class StartPage : FluentPage() {

    @FindBy(css = "input[name=q]")
    lateinit var searchField: FluentWebElement

    @FindBy(css = "button.i-button")
    lateinit var loginButton: FluentWebElement
}
