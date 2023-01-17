package in.iiits.crud;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.iiits.person.Violator;

public class CRUD {
	static Connection con;
	static PreparedStatement pst;
	static ResultSet rs;

	public static void Connect() throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","Harika#0214");
		
		
	}


	public static void File() throws IOException  {
		try {	
			pst = con.prepareStatement("drop table IF EXISTS Record");
			pst.executeUpdate();
			pst = con.prepareStatement("create table Record(ChallanNo varchar(100), Name varchar(100), VehicleNumber varchar(100), Violation varchar(100), Fine varchar(100));");
			pst.executeUpdate();
			
			String str;
			BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Harika Lingamsetty\\eclipse-workspace\\OOPproject\\src\\in\\iiits\\person\\Record.csv"));
			while((str = br.readLine())!= null) {
				String[] values = str.split(",");
				pst = con.prepareStatement("insert into Record(ChallanNo, Name, VehicleNumber, Violation, Fine) values ('"+values[0]+"', '"+values[1]+"', '"+values[2]+"', '"+values[3]+"', '"+values[4]+"')");
				pst.executeUpdate();
			}
			br.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Insert(String ChallanNo, String Name, String VehicleNumber, String V1, String V2, String Fine) throws IOException {
		String Violation = V1 +" " +V2;
		Violator v = new Violator(ChallanNo, Name, VehicleNumber, Violation, Fine);
		try {
			pst = con.prepareStatement("insert into Record(ChallanNo, Name, VehicleNumber, Violation, Fine) values(?,?,?,?,?)");
			pst.setString(1, ChallanNo);
			pst.setString(2, Name);
			pst.setString(3, VehicleNumber);
			pst.setString(4, Violation);
			pst.setString(5, Fine);
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("\n\nChallanNo		Name		VehicleNo		Violation		Fine\n");
		System.out.println(v.getChallanNo()+"		"+v.getName()+"		"+v.getVehicleNo()+"		"+v.getViolation()+"		"+v.getFine());
		System.out.println("\n\n........Record Added........\n\n");
	}

	public static void Delete(String ChallanNo) throws IOException {

		try {
			pst = con.prepareStatement("delete from record where ChallanNo = ?");
			pst.setString(1, ChallanNo);
			pst.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("\n\n........Record Deleted........\n\n");
	}

	public static void Update(String ChallanNo, String Name, String VehicleNumber, String V1, String V2, String Fine) throws IOException {
		
		String Violation = V1 +" " +V2;
		Violator v = new Violator(ChallanNo, Name, VehicleNumber, Violation, Fine);
		try {
			pst = con.prepareStatement("update record set ChallanNo = ?, Name = ?, VehicleNumber = ?, Violation = ?, Fine = ? where ChallanNo = ?");
			pst.setString(1, ChallanNo);
			pst.setString(2, Name);
			pst.setString(3, VehicleNumber);
			pst.setString(4, Violation);
			pst.setString(5, Fine);
			pst.setString(6, ChallanNo);
			pst.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("\n\nChallanNo		Name		VehicleNo		Violation		Fine\n");
		System.out.println(v.getChallanNo()+"		"+v.getName()+"		"+v.getVehicleNo()+"		"+v.getViolation()+"		"+v.getFine());
		System.out.println("\n\n........Record Updated........\n\n");
	}

	public static void Select() throws IOException {
		try {
			pst = con.prepareStatement("SELECT * FROM Record ORDER BY ChallanNo");
			rs = pst.executeQuery();
			Search.result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}