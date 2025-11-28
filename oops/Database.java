package oops;



import java.sql.*;

public class Database {

    public static void main(String[] args) throws Exception{
        // Connection details
        String url = "jdbc:postgresql://localhost:5432/hibavi";
        String username = "ocp";
        String password = "ocp";

        // JDBC variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1️⃣ Load the SQL Server JDBC driver
            Class.forName("org.postgresql.Driver");

            // 2️⃣ Establish the connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected to Postgress successfully!");

            // 3️⃣ Create a statement object
            statement = connection.createStatement();

            // 4️⃣ Execute SQL query
            String query = "SELECT * FROM users";
            resultSet = statement.executeQuery(query);

            // 5️⃣ Print the results
            System.out.println("\n--- Users Table Data ---");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + resultSet.getString(i) + "   ");
                }
                System.out.println(); // Move to next row
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6️⃣ Close all resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
