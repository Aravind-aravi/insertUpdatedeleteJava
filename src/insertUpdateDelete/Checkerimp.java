package insertUpdateDelete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class Checkerimp implements checker {

	@Override
	public boolean CheckAdmin(String AdminName, String AdminPassword) {
		String query;
        String dbUsername, dbPassword;
        boolean login = false;

        try {
           Connection  con = EstablishingConnection.getCon();
           Statement stmt = (Statement) con.createStatement();
            query = "SELECT AdminName, AdminPassword FROM admin;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                dbUsername = rs.getString("AdminName");
                dbPassword = rs.getString("AdminPassword");

                if(dbUsername.equals(AdminName) && dbPassword.equals(AdminPassword)){
                    login = true;
                }
                System.out.println(AdminName + AdminPassword + "  " + dbUsername + dbPassword);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return login;
		
	}

	@Override
	public boolean CheckAgent(String AgentName, String AgentPassword) {
		// TODO Auto-generated method stub
		System.out.println("name "+AgentName);
		System.out.println("password "+AgentPassword);
		String query;
        String dbUsername, dbPassword;
        boolean login= false;
        try {
           Connection  con = EstablishingConnection.getCon();
           Statement stmt = (Statement) con.createStatement();
            query = "SELECT AgentName, AgentPassword FROM agent;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                dbUsername = rs.getString("AgentName");
                dbPassword = rs.getString("AgentPassword");

                if(dbUsername.equals(AgentName) && dbPassword.equals(AgentPassword)){
                    login = true;
                    
                }
                System.out.println(AgentName + AgentPassword + "  " + dbUsername + dbPassword);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
		return login;
	}

}
