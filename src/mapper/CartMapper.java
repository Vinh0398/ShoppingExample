package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Cart;

public class CartMapper implements RowMapper<Cart>{
	@Override
	public Cart mapRow(ResultSet rs, int agr) throws SQLException {
		Cart cart = new Cart();
		cart.setId(rs.getString("CartId"));
		cart.setProductId(rs.getInt("ProductId"));
		cart.setTitle(rs.getString("Title"));
		cart.setImageUrl(rs.getString("ImageUrl"));
		cart.setPrice(rs.getInt("Price"));
		cart.setQuantity(rs.getShort("Quantity"));
		return cart;
	}
}
