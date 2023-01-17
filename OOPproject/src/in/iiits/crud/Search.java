package in.iiits.crud;

import in.iiits.person.Violator;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Search extends CRUD{

	public static void result() throws IOException {

		List<Violator> list = new ArrayList<Violator>();
		
		try {
			while (rs.next()) {

				String ChallanNo = rs.getString("ChallanNo");
				String Name = rs.getString("NAME");
				String VehicleNumber = rs.getString("VehicleNumber");
				String Violation = rs.getString("Violation");
				String Fine = rs.getString("Fine");

				Violator v = new Violator(ChallanNo, Name, VehicleNumber, Violation, Fine);
				
				list.add(v);			    
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("\nChallanNo		Name		VehicleNo		Violation		Fine\n");
		System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
	} 
	
	public static void SearchByChallanNo(String ChallanNo) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE ChallanNo = ?");
			pst.setString(1, ChallanNo);
			rs = pst.executeQuery();
			result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void SearchByName(String s) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE Name Like '%" +s+ "%' ");
			rs = pst.executeQuery();
			result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void SearchByVehicleNo(String s) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE VehicleNumber Like '%" +s+ "%' ");
			rs = pst.executeQuery();
			result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void SearchByViolation(String s) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE Violation Like '%" +s+ "%' ");
			rs = pst.executeQuery();
			result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void SearchByFineLess(String s) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE Fine < ? ");
			pst.setString(1, s);
			rs = pst.executeQuery();
			result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void SearchByFineGreater(String s) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE Fine > ? ");
			pst.setString(1, s);
			rs = pst.executeQuery();
			result();

		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void SearchByFineEqual(String s) throws IOException {

		try {
			pst = con.prepareStatement("SELECT * FROM Record WHERE Fine = ? ");
			pst.setString(1, s);
			rs = pst.executeQuery();
			result();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
