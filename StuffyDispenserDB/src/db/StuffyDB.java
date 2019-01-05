package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB implements DAO<Stuffy> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/stuffy";
		String username = "stuffy_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL,
												username, password);
		return connection;
	}

	@Override
	public Stuffy get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stuffy> getAll() throws SQLException {
		List<Stuffy> stuffies = new ArrayList<Stuffy>();
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * from Stuffy");
		while (rs.next()) {
			int id = rs.getInt(1);
			String type = rs.getString(2);
			String color = rs.getString(3);
			String size = rs.getString(4);
			Stuffy s = new Stuffy(id, type, color, size);
			stuffies.add(s);
		}
		rs.close();
		return stuffies;
	}

	@Override
	public boolean add(Stuffy s) throws SQLException {
		boolean success = false;
		
		Connection connection = getConnection();
		String query = "insert into stuffy" + 
				"(type, color, size)" + 
				"values ('"+s.getType() + "', '" + s.getColor() + "', '" + 
						s.getSize() + "')";
		
		Statement stmt = connection.createStatement();
		int rowCount = stmt.executeUpdate(query);
		if (rowCount > 0) success = true;
		return success;
	}

	@Override
	public boolean update(Stuffy t) {
		// NOT coding this right now.  To do later.
		return false;
	}

	@Override
	public boolean delete(Stuffy s) throws SQLException {
		Connection conn = getConnection();
		String query = "DELETE from Stuffy WHERE ID = " + s.getId();
		Statement stmt = conn.createStatement();
		int rowCount = stmt.executeUpdate(query);
		boolean success = false;
		if (rowCount > 0) success = true;
		return success;
	}

}
