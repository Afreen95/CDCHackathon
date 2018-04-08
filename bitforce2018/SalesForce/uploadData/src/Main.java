import java.sql.*;

public class Main {
	
	public static Connection getConnection() throws Exception{
		Connection conn = null;
		
		try {
			//This is the connection info for the Database.
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/salesforce";
			String username = "root";
			String password = "";
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		}
		catch(Exception e){
			System.err.println(e);
		}
		
		return conn;
	}
	
	//oauth2 for token login
	private static final String TOKEN_URL =  "https://login.salesforce.com/services/oauth2/token";

	public static void main(String[] args) throws Exception {
	
		//Here is the declaration of the code
		String username;
        String password;
        String consumerKey = "3MVG9CEn_O3jvv0wgkneEf.28pPJt6qBcw..pjSZtZyz2HpAY1la685u7_fkAPRNX6a3SStCJUWKlvQlV1hLW";
        String consumerSecret = "6313827912578209565";
		
		Connection conn = getConnection();
		
		Statement stmt = conn.createStatement();
		
		String sql = "SELECT * FROM sourcedata;";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		//If some result are present from the query
		if(rs.next()){
			String accountName = rs.getString("accountName");
			String type = rs.getString("type");
			String PARENTID = rs.getString("PARENTID");
			String BILLINGSTREET = rs.getString("BILLINGSTREET");
			String BILLINGCITY = rs.getString("BILLINGCITY");
			String BILLINGSTATE = rs.getString("BILLINGSTATE");
			String BILLINGPOSTALCODE = rs.getString("BILLINGPOSTALCODE");
			String BILLINGCOUNTRY = rs.getString("BILLINGCOUNTRY");
			String accountPhone = rs.getString("accountPhone");
			String ACCOUNTNUMBER = rs.getString("ACCOUNTNUMBER");
			String website = rs.getString("WEBSITE");
			String ANNUALREVENUE = rs.getString("ANNUALREVENUE");
			String INDUSTRY = rs.getString("INDUSTRY");
			String contactid = rs.getString("contactid");
			String ACCOUNTID = rs.getString("ACCOUNTID");
			String LASTNAME = rs.getString("LASTNAME");
			String FIRSTNAME = rs.getString("FIRSTNAME");
			String SALUTATION = rs.getString("SALUTATION");
			String contactName = rs.getString("contactName");
			String contactPhone = rs.getString("contactPhone");
			String MAILINGSTREET = rs.getString("MAILINGSTREET");
			String MAILINGCITY = rs.getString("MAILINGCITY");
			String MAILINGSTATE = rs.getString("MAILINGSTATE");
			String MAILINGPOSTALCODE = rs.getString("MAILINGPOSTALCODE");
			String MAILINGCOUNTRY = rs.getString("MAILINGCOUNTRY");
			String MOBILEPHONE = rs.getString("MOBILEPHONE");
			String OTHERPHONE = rs.getString("OTHERPHONE");
			String ASSISTANTPHONE = rs.getString("ASSISTANTPHONE");
			String EMAIL = rs.getString("EMAIL");
			String TITLE = rs.getString("TITLE");
			String DEPARTMENT = rs.getString("DEPARTMENT");
		
		}
		
		/*Here we would have added code to interact with the saleforce
		*
		*First login
		*
		*we need to send the user authorization
		*
		*create a instance of httpPost
		*
		*
		*adding to an array list the value to pass
		*
		*
		*
		**/

	}

}
