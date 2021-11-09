package dao;

import java.util.List;

import mapper.CartMapper;
import model.Cart;

public class CartRepository extends Repository{
	public List<Cart> getCarts(String id){
		return jdbc.query("CALL GetCarts(?)", new CartMapper(),id);
	}
	
	public int add(Cart obj) {
		return jdbc.update("CALL AddCart(?,?,?,?)", obj.getId(), obj. getMemberId(), obj.getProductId(), obj.getQuantity());
	}
}
