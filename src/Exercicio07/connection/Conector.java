package Exercicio07.connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conector {
	
	public static Connection connection = null;
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String DBNAME = "bdExercicio";//adicionar nome do banco correto
	private final static String URL = "jdbc:mysql://localhost:8080/"+DBNAME; //adicionar url correta
	private final static String LOGIN = "root"; //nome do user do banco
	private final static String SENHA = "";//senha se houver uma
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,LOGIN,SENHA);
			System.out.println("Conexao realizada com sucesso");
			return connection;
		}catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado "+e.toString());
			return null;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static Connection closeConnection() {
		try {
			connection.close();
			return connection;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}