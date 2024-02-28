package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Helper.ConnectDangNhap;
import model.NguoiDung;
import model.ThiSinh;

public class ThiSinhDao {
	public boolean insert(ThiSinh ts ) 
			throws Exception{
	
				String sql = "INSERT INTO dbo.ThiSinh(MaThiSinh,TenThiSinh,NgaySinh,GioiTinh,Lop,Truong,Tinh)\r\n"
						+ "VALUES(?,?,?,?,?,?,?)";
				try (
					Connection con = ConnectDangNhap.openConnection();
					PreparedStatement pstmt = con.prepareStatement(sql);
					){
					pstmt.setString(1,ts.getMaThiSinh());
					pstmt.setString(2,ts.getTenThiSinh());
					pstmt.setString(3,ts.getNgaySinh());
					pstmt.setInt(4,ts.getGioiTinh());
					pstmt.setString(5,ts.getLop());
					pstmt.setString(6,ts.getTruong());
					pstmt.setString(7,ts.getQueQuan().getTenTinh());
					
		return pstmt.executeUpdate()>0;
		}	
	}
	public boolean update(ThiSinh ts ) 
			throws Exception{
		
	
				String sql = "UPDATE dbo.ThiSinh"
						+ "				   SET MaThiSinh = ?,TenThiSinh = ?,NgaySinh = ?,GioiTinh =?,Lop = ?,Truong = ?,Tinh = ? "+" where MaThiSinh=?";
				try (
					Connection con = ConnectDangNhap.openConnection();
					PreparedStatement pstmt = con.prepareStatement(sql);
					){
					pstmt.setString(1,ts.getMaThiSinh());
					pstmt.setString(2,ts.getTenThiSinh());
					pstmt.setString(3,ts.getNgaySinh());
					pstmt.setInt(4,ts.getGioiTinh());
					pstmt.setString(5,ts.getLop());
					pstmt.setString(6,ts.getTruong());
					pstmt.setString(7,ts.getQueQuan().getTenTinh());
					pstmt.setString(8, ts.getMaThiSinh());
					
		return pstmt.executeUpdate()>0;
		}	
	}
	public boolean delete(String maThiSinh ) 
			throws Exception{
		
	
				String sql = "delete from ThiSinh "+"where MaThiSinh=?";
				try (
					Connection con = ConnectDangNhap.openConnection();
					PreparedStatement pstmt = con.prepareStatement(sql);
					){
					pstmt.setString(1,maThiSinh);
					
		return pstmt.executeUpdate()>0;
		}	
	}

}
