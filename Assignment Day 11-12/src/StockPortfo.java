import java.util.ArrayList;

public class StockPortfo {
	 ArrayList<Stock> portf = new ArrayList<>();
	    double totalValue = 0;

	    static class Stock {
	        int NoOfShare;
	        String company;
	        double price;
	    }

	    public double totalValue() {
	        for (Stock stock : portf) {
	            totalValue += stock.price * stock.NoOfShare;
	        }
	        return totalValue;
	    }
}
