package epam.com.exceptionlogging;

public class Compound {
  public double principle;
  public double interest;
  public double years;
  public double CI;
  
  public Compound(){
	  super();
  }
  public static double Compound(double principle,double interest,double years,double IC){
	  double CI;
		CI = (1 + (interest/100));
		while(IC != 0) {
			CI = CI * (1 + (interest/100));
			IC--;
		}
		CI = CI * principle;
	  return CI;
  }
}
