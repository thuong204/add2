package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.UIManager;

import Helper.ConnectDangNhap;
import view.LoginView;

public class LoginTest {
		public static void main(String[] args) throws SQLException {
			Connection connection =null;
			
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String connectionURL ="jdbc:sqlserver://DESKTOP-DB9MFIJ\\SQLEXPRESS:1433;databaseName=ConnectProjectJava;encrypt=false";
				connection = DriverManager.getConnection(connectionURL, "sa", "anhyeuem123@");
				Statement sm = connection.createStatement();
				ResultSet rs = sm.executeQuery("Select*from DiemThiSinh");
				ResultSetMetaData rsm = rs.getMetaData();
				int col_num = rsm.getColumnCount();
				for(int i=1 ; i<=col_num;i++) {
					System.out.println(rsm.getColumnLabel(i)+"    ");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Ket noi fail");
				System.err.print(e.getMessage()+"/n"+e.getClass()+"/n"+e.getCause());
			}
		}
	}

