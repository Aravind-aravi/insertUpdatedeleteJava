package insertUpdateDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class resimp implements Resdata {

	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertResData(DataObjects c) {
		// TODO Auto-generated method stub
		int status = 0;
		try {
			con = EstablishingConnection.getCon();
			ps = con.prepareStatement("insert into res1 values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, c.getUrl());
			ps.setString(3, c.getName());
			ps.setString(4, c.getAddress());
			ps.setString(5, c.getLocation());
			ps.setString(6, c.getCusine());
			ps.setString(7, c.getDishes());
			ps.setFloat(8, c.getPrice());
			ps.setFloat(9, c.getRatings());
			ps.setInt(10, c.getVotes());
			ps.setInt(11, c.getUniqueKey());
			status = ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public int updateResData(DataObjects c) {
		int status = 0;
		int sno = 0;
		try {
			con = EstablishingConnection.getCon();
			ps = con.prepareStatement(
					"UPDATE  res1 set Sno= ?,Url=?,Name=?,Adress=?,Location=?,Cusine=?,Dishes=?,Price=?,Ratings=?,Votes=? where UniqueKey= ? ");
			String query = "SELECT * FROM res1";

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				sno = rs.getInt("Sno");
			}

			ps.setInt(1, sno);
			ps.setString(2, c.getUrl());
			ps.setString(3, c.getName());
			ps.setString(4, c.getAddress());
			ps.setString(5, c.getLocation());
			ps.setString(6, c.getCusine());
			ps.setString(7, c.getDishes());
			ps.setFloat(8, c.getPrice());
			ps.setFloat(9, c.getRatings());
			ps.setInt(10, c.getVotes());
			ps.setInt(11, c.getUniqueKey());
			status = ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public int deleteResData(DataObjects c) {
		int status = 0;
		try {
			con = EstablishingConnection.getCon();
			ps = con.prepareStatement("DELETE FROM res1 WHERE UniqueKey = ?");
			ps.setInt(1, c.getUniqueKey());
			status = ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
