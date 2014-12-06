import static org.junit.Assert.*;

import org.junit.Test;


public class JCalcTest {
	/*double eighteen_percent = Calc.HousingPayment(grossIncome);
	double thirtysix = Calc.debtPayments(grossIncome, monthlyDebt);
    double pmtAllowed = Calc.canSpend(eighteen_percent, thirtysix);
    Double mortgage = Calc.mortgageAllowed(pmtAllowed, dwnPmt,r, term);
*/
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		   assertEquals("", 840, Calc.HousingPayment(56000),0.0000005);
		   assertEquals("", 1380, Calc.debtPayments(56000, 300),0.00005);
		   assertEquals("", 840, Calc.canSpend(Calc.HousingPayment(56000),Calc.debtPayments(56000, 300)), 0.000005);
		   assertEquals("", 140104.956, Calc.mortgageAllowed(840,0,0.06,30),0.005);

	
	}

}
