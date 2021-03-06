package config.annotations

enum class Browsers(val value: String) {
    FIREFOX("firefox"),
    FIREFOX_HEADLESS("firefox-headless"),
    CHROME("chrome"),
    CHROME_HEADLESS("chrome-headless"),
    SAFARI("safari"),
    OPERA("opera"),
    EDGE("edge"),
    INTERNET_EXPLORER("ie"),
    DEFAULT("");

    companion object {
        fun byString(s: String) = Browsers.values().find { it.value == s } ?: throw RuntimeException("invalid browser '$s' requested")
    }
}