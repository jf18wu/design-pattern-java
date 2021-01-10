package patterns.creationalPattern.prototypePatern

import patterns.creationalPattern.prototypePattern.PrototypePattern
import spock.lang.Specification

class PrototypePatternSpec extends Specification {
    private PrototypePattern subject

    def "Verify the clone method in Prototype Pattern"() {
        when:
        subject = new PrototypePattern()

        then:
        subject.instanceA.doors == subject.instanceB.doors
        subject.instanceA.wheels == subject.instanceB.wheels
        subject.instanceA.brands == subject.instanceB.brands
        subject.instanceA != subject.instanceB
    }
}
