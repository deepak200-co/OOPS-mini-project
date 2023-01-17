package in.iiits.crud;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations extends CRUD{
	
	public static void totalRecords() {
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(1) as COUNT FROM Record ");
			rs.next();
			System.out.println("\nTotal No. of Records : " + rs.getInt("COUNT"));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void MaxFine() throws IOException {
		
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery("SELECT ChallanNo, Name, VehicleNumber, Violation, Fine FROM Record WHERE Fine = (SELECT MAX(Fine) FROM Record)");
			System.out.println("\nChallanNo		Name		VehicleNo		Violation		Fine\n");
			while (rs.next()) {
				System.out.println(rs.getString("ChallanNo")+"		"+rs.getString("Name")+"		"+rs.getString("VehicleNumber")+"		"+rs.getString("Violation")+"		"+rs.getString("Fine"));			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void ViolationsCount() throws IOException {
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery("SELECT Violation, COUNT(Violation) as COUNT FROM Record GROUP BY Violation");
			System.out.println("\nViolation		 Fine\n");
			while (rs.next()) {
				System.out.println(rs.getString("Violation")+" :		 "+ rs.getInt("COUNT"));			
			}			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
