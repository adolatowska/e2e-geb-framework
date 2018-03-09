import org.openqa.selenium.firefox.FirefoxDriver
// import org.openqa.selenium.chrome.ChromeDriver
System.properties.'webdriver.gecko.driver' = "C:\\geckodriver.exe"

waiting {
    timeout = 2
}

environments {
//    chrome {
//        driver = { new ChromeDriver }
//    }

    firefox {
        atCheckWaiting = 1

        driver = { new FirefoxDriver() }
    }
}

reportsDir = "target/geb-reports"

baseUrl = "http://google.pl"