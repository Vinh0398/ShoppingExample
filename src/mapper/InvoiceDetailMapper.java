package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.InvoiceDetail;

public class InvoiceDetailMapper implements RowMapper<InvoiceDetail>{
	@Override
	public InvoiceDetail mapRow(ResultSet rs, int arg1) throws SQLException {
		return new InvoiceDetail(rs.getString("InvoiceId"), rs.getInt("ProductId"), rs.getShort("Quantity"),
				rs.getInt("Price"), rs.getString("Title"), rs.getString("ImageUrl"));
	}

}
