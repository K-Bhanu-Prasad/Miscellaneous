package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.model.Circle;

public class JdbcDaoImpl {

	public Circle getCircle(int circleId) {
		Connection conn = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.99.100:1521:xe","system","oracle");

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM CIRCLE WHERE id=?");
			ps.setInt(1, circleId);

			Circle circle =null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			ps.close();

			return circle;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}
}
