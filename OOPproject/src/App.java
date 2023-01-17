import java.io.IOException;
import java.sql.SQLException;

import in.iiits.crud.CRUD;
import in.iiits.crud.Operations;
import in.iiits.crud.Search;


public class App {

	public static void printHelp(){
		System.out.println("\nHelp for commands:\n");
		System.out.println("-import 							: to create table in database and import from csv file ");
		System.out.println("-insert <ChallanNo> <Name> <VehicleNumber> <Violation> <Fine>   : to insert record");
		System.out.println("-update <ChallanNo> <Name> <VehicleNumber> <Violation> <Fine>	: to update record using ChallanNo");
		System.out.println("-delete <ChallanNo> 						: to delete record using ChallanNo");
		System.out.println("-select								: to display record  ");
		System.out.println("-search-challanNo <ChallanNo> 					: to search record by ChallanNo ");
		System.out.println("-search-name <Name> 						: to search record by Name ");
		System.out.println("-search-vehicleno <VehicleNumber> 				: to search record by VehicleNumber ");
		System.out.println("-search-violation <Violation> 					: to search record by Violation ");
		System.out.println("-search-fine-lt <Fine> 						: to search record by Fine less than ");
		System.out.println("-search-fine-gt <Fine> 						: to search record by Fine greater than");
		System.out.println("-search-fine-eql <Fine> 					: to search record by Fine equal to ");
		System.out.println("-totalrecords							: to find total number of records");
		System.out.println("-maxfine 							: to find max Fine");
		System.out.println("-violationscount 						: to find number of violations in each case");
		System.out.println("\n-h (or any) for help menu");
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		CRUD.Connect();	

		switch (args[0]) {
		case "-import":
			try {
				CRUD.File();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nRecord imported from csv file");
			break;
		case "-insert":
			CRUD.Insert(args[1],args[2],args[3],args[4],args[5],args[6]);
			break;
		case "-update":
			CRUD.Update(args[1],args[2],args[3],args[4],args[5],args[6]);
			break;
		case "-delete":
			CRUD.Delete(args[1]);
			break;
		case "-select":
			CRUD.Select();
			break;
		case "-search-challanNo":
			Search.SearchByChallanNo(args[1]);
			break;
		case "-search-name":
			Search.SearchByName(args[1]);
			break;
		case "-search-vehicleno":
			Search.SearchByVehicleNo(args[1]);
			break;
		case "-search-violation":
			Search.SearchByViolation(args[1]);
			break;
		case "-search-fine-lt":
			Search.SearchByFineLess(args[1]);
			break;
		case "-search-fine-gt":
			Search.SearchByFineGreater(args[1]);
			break;
		case "-search-fine-eql":
			Search.SearchByFineEqual(args[1]);
			break;
		case "-totalrecords":
			Operations.totalRecords();
			break;
		case "-maxfine":
			Operations.MaxFine();
			break;
		case "-violationscount":
			Operations.ViolationsCount();
			break;
		default :
			printHelp();
            break;
		}
	}
}
