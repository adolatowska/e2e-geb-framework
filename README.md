# Geb automation framework for E2E tests
Framework for automated end-to-end UI tests based on Geb and Spock.

Technology stack, starting from the highest layer:
- Spock for writing tests specification
- Geb as a main layer interacting with Selenium WebDriver
- Groovy as a scripting language
- Selenium WebDriver which communicates with browser

## Run tests
Project uses Gradle as a build tool and for running tests. It is possible to run tests on Firefox or Chrome browsers. 


### Run on Firefox
type *./gradlew firefoxTest* in console

### Run on Chrome
type *./gradlew chromeTest* in console

### Run as JUnit
Thanks Spock it is also possible to run single test as simple JUnit test from your IDE. For example, in IntelliJ IDEA you can do this by clicking right mouse button on test specification class name and choose option "Create <name_of_your_test_class>...".

## Test reports
Reports are generated automatically, after every tests run. To generate reports it is used build-in Geb's reporter tool. It produces reports as *html files available in /build/reports/tests/test directory. The tool also provide screenshots capturing which are saved in /target/geb-reports directory.