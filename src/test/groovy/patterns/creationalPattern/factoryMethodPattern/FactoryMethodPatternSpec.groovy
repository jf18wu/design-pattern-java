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
    def "Expected Stock Objects"() {
        when:
        Stock result = subject.getStock(stockType)
//        result.getPrice()
//        def resultVal = result.calculateValue(units.toDouble())

        then:
        result.getClass() == clazz
//        expectedValue.toDouble() == resultVal

        where:
        stockType  |  units  |  expectedValue  |  clazz
        'TWStock'  |  1.0    |  1.0  |  TWStock.class
        'USSTOCK'  |  2.0    |  60.0  |  USStock.class
        'jastock'  |  3.0    |  9.0  |  JPStock.class
        'jPsToCk'  |  0.0    |  0.0  |  JPStock.class
    }
}
