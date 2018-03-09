package pages

import geb.Page

class GoogleResultsPage extends Page {
    static at = { title.contains("Szukaj w Google") }

    static content = {
        firstResultLink { $("div.g:nth-child(1) .r a") }
    }

    Boolean getFirstResultTitle(String query) {
        return firstResultLink.getAttribute("href").contains("gebish.org")
    }
}
