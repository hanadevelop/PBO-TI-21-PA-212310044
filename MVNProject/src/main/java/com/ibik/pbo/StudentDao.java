package com.ibik.pbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.ibik.pbo.praktikum.ConnectionDB;

public class StudentDao {
	private Statement stat;
	private ResultSet res;
	
	private String sqlInsert = "insert into student (fullname,email, phone, gender, citizenship, password) " + "values (?,?,?,?,?,?)";
	private String sqlInsertScore = "insert into student_score (npm,nama, nilai) " + "values (?,?,?)";
    private String sqlUpdate = "update student set fullname=?, email=?, phone=?, gender=?, citizenship=?, password=? " + "where student_id = ?";
    private String sqlUpdateScore = "update student_score set npm=?, nama=?, nilai=?" + "where student_score_id= ?";
    private String sqlCariSemua = "select * from student order by fullname asc";
    private String sqlCariByID = "select * from student where student_id = ?";
    private String sqlHapusById = "delete from student where student_id = ?";
    private String sqlHapusByScoreId = "delete from student_score where student_score_id = ?";
    private String sqlCariAccount = "select * from student where email = ? and password = ?";
    private String sqlTable = "select * from student_score";
    private String sqlCariByScoreId = "select * from student_score where student_score_id = ?";

    public void saved(Student students) throws Exception {
        Connection c = new ConnectionDB().connect();
        
        if (students.getId() == null) {
            PreparedStatement psInsert = c.prepareStatement(sqlInsert);
            psInsert.setString(1, students.getFullname());
            psInsert.setString(2, students.getEmail());
            psInsert.setString(3, students.getPhone());
            psInsert.setString(4, students.getGender());
            psInsert.setString(5, students.getCitizenship());
            psInsert.setString(6, students.getPassword());

            psInsert.executeUpdate();
        } else {
            PreparedStatement psUpdate = c.prepareStatement(sqlUpdate);
            psUpdate.setString(1, students.getFullname());
            psUpdate.setString(2, students.getEmail());
            psUpdate.setString(3, students.getPhone());
            psUpdate.setString(4, students.getGender());
            psUpdate.setString(5, students.getCitizenship());
            psUpdate.setString(6, students.getPassword());
            psUpdate.setInt(7, students.getId());

            psUpdate.executeUpdate();
        }
        c.close();
    }
    
    public void savedScore(StudentScore studentscore) throws Exception {
    	Connection c = new ConnectionDB().connect();
    	
    		PreparedStatement psInsertScore = c.prepareStatement(sqlInsertScore);
        	psInsertScore.setString(1, studentscore.getNpm());
        	psInsertScore.setString(2, studentscore.getNama());
        	psInsertScore.setString(3, studentscore.getNilai());

        	psInsertScore.executeUpdate();
    }

    public List<Student> findAll() throws Exception {
        List<Student> hasil = new ArrayList<Student>();

        Connection c = new ConnectionDB().connect();
        PreparedStatement psCariSemuaProduk = c.prepareStatement(sqlCariSemua);
        
        ResultSet rs = psCariSemuaProduk.executeQuery();
        while(rs.next()){
            Student students = konversiResultSet(rs);            
            hasil.add(students);
        }
        
        c.close();
        return hasil;
    }
    
    public Student findByID(Integer student_id) throws Exception{
        if(student_id == null){
            return null;
        }
        Connection c = new ConnectionDB().connect();
        PreparedStatement psCariById = c.prepareStatement(sqlCariByID);
        psCariById.setInt(1, student_id);
        ResultSet rs = psCariById.executeQuery();
        if(!rs.next()){
            return null;
        }
        Student students = konversiResultSet(rs);
        c.close();
        return students;
    }

    public void removed(Integer student_id) throws Exception{
        if(student_id == null){
            return;
        }        
        Connection c = new ConnectionDB().connect();
        PreparedStatement psHapusById = c.prepareStatement(sqlHapusById);
        psHapusById.setInt(1, student_id);
        psHapusById.executeUpdate();
        c.close();
    }
    
    public void deleteScore(String ScoreId) throws Exception{
        if(ScoreId.equals("")){
            return;
        }        
        Connection c = new ConnectionDB().connect();
        PreparedStatement psHapusByScoreId = c.prepareStatement(sqlHapusByScoreId);
        psHapusByScoreId.setString(1, ScoreId);
        psHapusByScoreId.executeUpdate();
        c.close();
    }
    
    public Student findByAccount(String email, String password) throws Exception{
        if(email == null){
            return null;
        }
        Connection c = new ConnectionDB().connect();
        PreparedStatement psCariByAccount = c.prepareStatement(sqlCariAccount);
        psCariByAccount.setString(1, email);
        psCariByAccount.setString(2, password);
        ResultSet rs = psCariByAccount.executeQuery();
        if(!rs.next()){
            return null;
        }
        Student students = konversiResultSet(rs);
        c.close();
        return students;
    }

    private Student konversiResultSet(ResultSet rs) throws SQLException{
        Student students = new Student();
        students.setId(rs.getInt("student_id"));
        students.setFullname(rs.getString("fullname"));
        students.setEmail(rs.getString("email"));
        students.setPhone(rs.getString("phone"));
        students.setGender(rs.getString("gender"));
        students.setCitizenship(rs.getString("citizenship"));
        students.setPassword(rs.getString("password"));
        return students;
    }
    
    public DefaultTableModel tabel() throws SQLException {
		Connection c = new ConnectionDB().connect();
		PreparedStatement psTable = c.prepareStatement(sqlTable);
		
		DefaultTableModel tb= new DefaultTableModel();
		
		tb.addColumn("ID");
		tb.addColumn("NPM");
		tb.addColumn("Nama");
		tb.addColumn("Nilai");
		try{
			res = psTable.executeQuery();
		while (res.next())
		{
			tb.addRow(new Object[]{
				res.getInt("student_score_id"),	
				res.getString("npm"),
				res.getString("nama"),
				res.getString("nilai")
			});
		}

		}catch (Exception e){
			
		}
		
		return tb;
	}


}
