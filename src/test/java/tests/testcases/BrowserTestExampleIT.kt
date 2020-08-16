package tests.testcases
import config.SeleniumTest
import config.annotations.Browser
import config.annotations.Browsers
import config.annotations.Screenshot
import config.driver.Breakpoint
import io.qameta.allure.Description
import org.fluentlenium.assertj.FluentLeniumAssertions.assertThat
import org.fluentlenium.core.annotation.Page
import org.junit.jupiter.api.Test
import tests.pageobjects.StartPage

@Browser(dimension = Breakpoint.XLARGE, use = Browsers.CHROME)
@Screenshot
class BrowserTestExampleIT : SeleniumTest() {

    @Page
    lateinit var page: StartPage

    @Test
    fun `an example test using page object pattern`() {
        goTo(page)
        assertThat(page.searchField).isDisplayed
    }

    @Test
    @Description("this is a custom description that will be visible in the detailed test report")
    fun `an example test NOT using page object pattern`() {
        goTo("https://github.com")
        assertThat(el("input[name=q]")).isDisplayed
    }
}