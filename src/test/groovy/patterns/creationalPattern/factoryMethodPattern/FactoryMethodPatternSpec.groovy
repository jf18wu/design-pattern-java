package patterns.creationalPattern.factoryMethodPattern


import spock.lang.Specification
import spock.lang.Unroll

class FactoryMethodPatternSpec extends Specification {

    FactoryMethodPattern subject

    def setup() {
        subject = new FactoryMethodPattern()
    }

    def "Error if not matching any type"() {
        when:
        subject.getStock("NotExistOne")

        then:
        def ex = thrown(RuntimeException)
        "Type not available" == ex.message
    }

    @Unroll
    def "Expected Stock Objects"(String stockType, double units, double expectedValue, Class clazz) {
        when:
        Stock result = subject.getStock(stockType)
        result.getPrice()

        then:
        result.getClass() == clazz
        expectedValue == result.calculateValue(units)

        where:
        stockType  |  units  |  expectedValue  |  clazz
        'TWStock'  |  1.0    |  1.0            |  TWStock.class
        'USSTOCK'  |  2.0    |  60.0           |  USStock.class
        'jpstock'  |  3.0    |  9.0            |  JPStock.class
        'jPsToCk'  |  0.0    |  0.0            |  JPStock.class
    }
}
