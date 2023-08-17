package edu.prodapt.demos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CollegeBO {
    private Scanner scan = new Scanner(System.in);
    private List<College> list = new ArrayList<>();
    //to add details
    public void addDetails(College col) throws SQLException {
        System.out.print("Enter college name: ");
        String name = scan.next();
        System.out.print("Enter website: ");
        String website = scan.next();
        System.out.print("Enter mobile phone: ");
        String mobile = scan.next();
        System.out.print("Enter founder: ");
        String founder = scan.next();
        System.out.print("Enter number of departments: ");
        int numberOfDept = scan.nextInt();
        System.out.print("Enter location: ");
        String location = scan.next();
        System.out.print("Enter Starting date (yyyy-MM-dd): ");
        String startingDateStr = scan.next();
        Date startingDate = java.sql.Date.valueOf(startingDateStr);
        College col1 = new College(name, website, mobile, founder, numberOfDept, location, startingDate);
        String sql = "insert into college_details values (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, col1.getName());
            ps.setString(2, col1.getWebsite());
            ps.setString(3, col1.getMobile());
            ps.setString(4, col1.getFounder());
            ps.setInt(5, col1.getNumberOfDept());
            ps.setString(6, col1.getLocation());
            ps.setDate(7, new java.sql.Date(col1.getStartingDate().getTime()));
            ps.executeUpdate();
            System.out.println("College details added successfully.");
        }
    }
    //search based on the name
    public List<College> findCollege(List<String> nameList) throws SQLException{
        String sql = "select * from college_details where name = ?";
        String dateConversionFunction = "STR_TO_DATE(startingDate, '%d-%m-%Y')";
        String modifiedSql = sql.replace("startingDate", dateConversionFunction);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
             PreparedStatement ps = con.prepareStatement(modifiedSql)) {
        	for (String name : nameList) {
            ps.setString(1, name);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String collegeName = resultSet.getString("name");
                String website = resultSet.getString("website");
                String mobile = resultSet.getString("mobile");
                String founder = resultSet.getString("founder");
                int numberOfDept = resultSet.getInt("numberOfDept");
                String location = resultSet.getString("location");
                java.sql.Date sqlStartingDate = resultSet.getDate("startingDate");
                java.util.Date utilStartingDate = new java.util.Date(sqlStartingDate.getTime());
                College col = new College(collegeName, website, mobile, founder, numberOfDept, location, utilStartingDate);
                list.add(col);
            }
        }
        }
        return list;
    }
//search by startingdate
    public List<College> findCollege(Date startingDate) throws SQLException {
        String sql = "select * from college_details where startingDate = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, new java.sql.Date(startingDate.getTime())); 
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String website = resultSet.getString("website");
                String mobile = resultSet.getString("mobile");
                String founder = resultSet.getString("founder");
                int numberOfDept = resultSet.getInt("numberOfDept");
                String location = resultSet.getString("location");
                College col = new College(name, website, mobile, founder, numberOfDept, location, startingDate);
                list.add(col);
            }
        }
        return list;
    }
//search by location
    public List<College> findCollege(String location) throws SQLException{
        String sql = "select * from college_details where location = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, location);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String website = resultSet.getString("website");
                String mobile = resultSet.getString("mobile");
                String founder = resultSet.getString("founder");
                int numberOfDept = resultSet.getInt("numberOfDept");
                Date startingDate = resultSet.getDate("startingDate");
                College col = new College(name, website, mobile, founder, numberOfDept, location, startingDate);
                list.add(col);
            }
        }
                return list;
    }
    
    public List<College> noOfDept() throws SQLException{
        String sql = "select * from college_details";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String website = resultSet.getString("website");
                String mobile = resultSet.getString("mobile");
                String founder = resultSet.getString("founder");
                int numberOfDept = resultSet.getInt("numberOfDept");
                String location = resultSet.getString("location");
                Date startingDate = resultSet.getDate("startingDate");
                College col = new College(name, website, mobile, founder, numberOfDept, location, startingDate);
                list.add(col);
            }
        }
                return list;
    }
 
}
