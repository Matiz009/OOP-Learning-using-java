import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From admin ");
            while (resultSet.next()) {
                System.out.printf(resultSet.getString("regId")+"\t");
                System.out.println(resultSet.getString("fName"));
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
