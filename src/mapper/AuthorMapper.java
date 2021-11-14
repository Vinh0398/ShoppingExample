package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Author;

public class AuthorMapper implements RowMapper<Author>{
	@Override
	public Author mapRow(ResultSet rs, int arg1) throws SQLException {
		Author author = new Author(rs.getInt("AuthorId"),rs.getString("AuthorName"));
		/*
		 * author.setId(rs.getInt("AuthorId"));
		 * author.setName(rs.getString("AuthorName"));
		 */
		return author;
	}
}
