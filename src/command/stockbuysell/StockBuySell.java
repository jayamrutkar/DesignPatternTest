package command.stockbuysell;

interface Order{
	abstract void execute();
}

class Stock{
	public void buy(){
		System.out.println("Buy Stock");
	}
	
	public void sell(){
		System.out.println("Sell Stock");
	}
}

class BuyStockCommand implements Order{

	Stock stock;
	
	public BuyStockCommand(Stock stock){
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.buy();
	}
	
}

class SellStockCommand implements Order{
	
	Stock stock;
	
	public SellStockCommand(Stock stock){
		this.stock = stock;
	}
	
	@Override
	public void execute(){
		stock.sell();
	}
}

class Agent {
	
	private Order order;
	
	public void setCommand(Order order){
		this.order= order;
	}
	
	public void placeOrder(){
		order.execute();
	}
}

public class StockBuySell {

	public static void main(String[] args){
		
		Stock xStock = new Stock();
		
		BuyStockCommand buyCommand = new BuyStockCommand(xStock);
		SellStockCommand sellCommand = new SellStockCommand(xStock);
		
		Agent agent = new Agent();
		agent.setCommand(buyCommand);
		agent.placeOrder();
		
		agent.setCommand(sellCommand);
		agent.placeOrder();
		
	}
	
}
