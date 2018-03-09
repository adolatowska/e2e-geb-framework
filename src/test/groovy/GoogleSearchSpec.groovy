import geb.spock.GebReportingSpec
import junit.framework.TestResult
import pages.GoogleHomePage
import pages.GoogleResultsPage
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class GoogleSearchSpec extends GebReportingSpec {

    @Shared
    final static String QUERY = "geb automation framework"
    final static String RESULT = "gebish.org"

    def "should go to main page"(){
        when:
        to GoogleHomePage

        then:
        at GoogleHomePage
    }

    def "should search query"() {
        given:
        at GoogleHomePage

        when:
        findQuery(QUERY)

        then:
        at GoogleResultsPage

        and:
        getFirstResultTitle(RESULT)
    }
}
