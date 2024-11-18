package db;

import java.sql.*;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbs_connection";

    private static final String USER = "root";

    private static final String PASSWORD = "Elvin2024";

    public static Connection connection = null;

    public static Connection getConnection() throws SQLException{
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connection is successfull");
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC driver is not found.");
                e.printStackTrace();
            }
        }
            return connection;
            }
    public static PreparedStatement createPreparedStatement(String query, Object... params)
            throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }

        return preparedStatement;
    }

    public static ResultSet executeQuery(PreparedStatement preparedStatement)
            throws SQLException {
        return preparedStatement.executeQuery();
    }

    public static int executeUpdate(PreparedStatement preparedStatement)
            throws SQLException {
        return preparedStatement.executeUpdate();
    }

    public static void closeResources(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            try {
                if (resource != null) {
                    resource.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}