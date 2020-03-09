package epam.com.exceptionlogging;

public class Simple {
    public double borrowedmoney;
    public double interest;
    public double time;
    public Simple(){
    	super();
    	
    }
    public static double Simple(double borrowedmoney,double interest,double time){
    	double simpleIntrest;
		simpleIntrest = (borrowedmoney * interest * time) / 100;
		return simpleIntrest;
	}

}


