import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

import java.util.ArrayList;

public class Test
{
	private final static String USER = "dev";
	private final static String PASSWORD = "3r!DE32*/fDe";
	private final static String URL = "jdbc:mysql://64.226.126.239:3306/carport";
	public static void main(String[] args) throws DatabaseException {


		ConnectionPool connectionPool = new ConnectionPool(USER, PASSWORD, URL);


		JavaCSG csg = JavaCSGFactory.createDefault();
		ArrayList<MaterialVariant> getid = MaterialVariantMapper.getMaterialVariantByID(23,connectionPool);
		System.out.println(getid);







		










	}
}
