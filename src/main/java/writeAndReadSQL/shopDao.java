package writeAndReadSQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class shopDao extends baseDao {
	public  void selShops(){
		try {
			java.sql.Connection cn =  ds.getConnection();
			java.sql.Statement sa = cn.createStatement();
			
			ResultSet rs =sa.executeQuery("select @@version");
			String version = rs.getString(0);
			System.out.println(version);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
