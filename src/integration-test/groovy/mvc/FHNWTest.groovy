package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class FHNWTest extends GebSpec {

    void "Test FHNW Title"(){
        when:
        go "https://www.fhnw.ch/en"
        then:
        title == "University of Applied Sciences and Arts Northwestern Switzerland | FHNW"
    }
}
