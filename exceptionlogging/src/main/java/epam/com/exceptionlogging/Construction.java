package epam.com.exceptionlogging;

import java.util.Scanner;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;

public class Construction {
private static final Logger LOGGER = (Logger) LogManager.getLogger(App.class);
    
	public static void estimation() {
    	Scanner sc = new Scanner(System.in);
    	LOGGER.info("Enter the area of the house");
    	
    	double area = sc.nextDouble();
    	double totalCost;
    	
    	LOGGER.info("1.Standard materials 2.Above standard materials 3.High standard materials "
    			+ "4.High standard material and fully automated home 5.");
    	int choice = sc.nextInt();
    	double cost[] = {1200, 1500, 1800, 2500};
    	totalCost = area * cost[choice - 1];
    	
    	LOGGER.info("The total amount to construct a house is " + totalCost);
    	
    }

}
