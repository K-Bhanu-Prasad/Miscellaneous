package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jdbc.model.Circle;

@Component
public class JdbcDaoImpl {

	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	public Circle getCircle(int circleId) {
		Connection conn = null;
		try {
			conn=dataSource.getConnection();

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

	public int getCircleCount() {
		return this.jdbcTemplate.queryForInt("SELECT COUNT(*) FROM CIRCLE");
	}

	public String getCircleName(int circleId) {
		String sql="SELECT NAME FROM CIRCLE WHERE ID = ?";
		return this.jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
	}

	public Circle getCircleForId(int circleId) {
		String sql= "SELECT * FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId},new CircleMapper());
	}

	public List<Circle> getAllCircles() {
		String sql= "SELECT * FROM CIRCLE";
		return jdbcTemplate.query(sql,new CircleMapper());
	}

	private static final class CircleMapper implements RowMapper<Circle>{

		@Override
		public Circle mapRow(ResultSet resultSet, int arg1) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));

			return circle;
		}

		}

}
