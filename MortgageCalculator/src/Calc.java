
public class Calc {
	
	public static double HousingPayment(double GrossIncome){
		double hsgpmt = (GrossIncome/12)*0.18;
		return hsgpmt;
	
	}

	public static double debtPayments(double GrossIncome, double monthlyDebt){
		double pmt = ((GrossIncome/12)*0.36)-monthlyDebt;
		return pmt;
		
	}
	
	public static double canSpend(double pmt, double hsgpmt){
		if(pmt<hsgpmt){
			return pmt;
			
		}
		else{
			return hsgpmt;
		}
	}
	public static double mortgageAllowed(double allowable_pmt, double downPayment, double rate, int term){
		int months = term*12;
		double monthlyrate = rate/12;
		double monthlyratepow = Math.pow(1+monthlyrate, months);
		double PV = (allowable_pmt)*(((1-(1/monthlyratepow))/monthlyrate)+downPayment);
		
		return PV;

	}
}
