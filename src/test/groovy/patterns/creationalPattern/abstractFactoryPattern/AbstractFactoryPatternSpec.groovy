package patterns.creationalPattern.abstractFactoryPattern

import patterns.creationalPattern.abstractFactoryPattern.bank.Bank
import patterns.creationalPattern.abstractFactoryPattern.bank.Tai
import patterns.creationalPattern.abstractFactoryPattern.bank.Yuan
import patterns.creationalPattern.abstractFactoryPattern.loan.EduLoan
import patterns.creationalPattern.abstractFactoryPattern.loan.HouseLoan
import patterns.creationalPattern.abstractFactoryPattern.loan.Loan
import spock.lang.Specification

class AbstractFactoryPatternSpec extends Specification {

    def "Verify FactoryCreator"(String target, Class factoryType) {
        when:
        AbstractFactory resultFac = FactoryCreator.getFactory(target)

        then:
        factoryType == resultFac.getClass()

        where:
        target  |  factoryType
        'bank'  |  BankFactory.class
        'LOAN'  |  LoanFactory.class
    }


    def "Verify Bank Factory"(String target, Class bankType) {
        given:
        AbstractFactory bankFac = FactoryCreator.getFactory('bank')

        when:
        Bank resBank = bankFac.getBank(target)
        Loan resLoan = bankFac.getLoan('Edu')

        then:
        bankType == resBank.getClass()
        null == resLoan

        where:
        target  |  bankType
        'tai'   |  Tai.class
        'YUAN'  |  Yuan.class
    }

    def "Verify Loan Factory"(String target, Class loanType) {
        given:
        AbstractFactory loanFac = FactoryCreator.getFactory('loan')

        when:
        Loan resLoan = loanFac.getLoan(target)
        Bank resBank = loanFac.getBank('Yuan')

        then:
        loanType == resLoan.getClass()
        null == resBank

        where:
        target  |  loanType
        'edu'   |  EduLoan.class
        'HOUSE' |  HouseLoan.class
    }

}
