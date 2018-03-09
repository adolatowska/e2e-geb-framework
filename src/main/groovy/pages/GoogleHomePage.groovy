package pages

import geb.Page
import geb.module.TextInput

class GoogleHomePage extends Page {
    static at = { title == "Google" }

    static content = {
        searchInput { $("input[name='q']").module(TextInput) }
        searchButton { $("input[value='Szukaj w Google']") }
    }

    void findQuery(String query) {
        searchInput.text = query
        searchButton.click()
    }
}
