package dao;

import java.util.List;

import javax.swing.tree.RowMapper;

import mapper.AuthorMapper;
import model.Author;

public class AuthorRepository extends Repository {
	public List<Author> getAuthors(){
		return jdbc.query("SELECT * FROM author", new AuthorMapper());
	}
	public int add(Author obj) {
		return jdbc.update("INSERT INTO Author (AuthorName) VALUES(?)", obj.getName());
	}
	public int edit(Author obj) {
		return jdbc.update("UPDATE Author SET AuthorName = ? WHERE AuthorId = ?", obj.getName(), obj.getName());
	}
	public Author getAuthor(int id) {
		return jdbc.queryForObject("SELECT * FROM Author WHERE AuthorId = ?", new AuthorMapper(), id);
	}
	public int delete(int id) {
		return jdbc.update("DELETE FROM Author WHERE AuthorId = ?", id);
	}
}
