package list.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> cart = new ArrayList<Item>();
	
	public void addtemToTheCart(Item item) {
		this.cart.add(item);
	}
	
	public void removeItemFromTheCart(Item item) {
		int index = this.cart.indexOf(item);
		this.cart.remove(index);
	}
	
	public double calculateTotal() {
		double total =0;
		for(Item item:cart) {
			total += item.getPreco() * item.getQuantidade();
		}
		return total;
	}
	
	public void seeItems() {
		for(Item item:cart) {
			System.out.println("nome: "+item.getNome());
			System.out.println("preço: "+item.getPreco());
			System.out.println("quantidade: "+item.getQuantidade());
		}
	}
	
	
}
