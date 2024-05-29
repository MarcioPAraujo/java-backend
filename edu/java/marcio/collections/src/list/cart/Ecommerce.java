package list.cart;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		Item item = newItem("cellphone", 2000, 1);
		cart.addtemToTheCart(item);
		item = newItem("pan", 100, 5);
		cart.addtemToTheCart(item);
		item = newItem("cutlery", 200, 2);
		cart.addtemToTheCart(item);
		
		cart.removeItemFromTheCart(item);
		System.out.println(cart.calculateTotal());
		
		cart.seeItems();
	}
	public static Item newItem(String product, double price, int amount) {
		Item item = new Item();
		item.setNome(product);
		item.setPreco(price);
		item.setQuantidade(amount);
		
		return item;
	}

}
