/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.util;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBCHelper implements AutoCloseable{
//    public static int executeUpdate(String sql,Object... objects){
//        int affectedRow = 0;
//        try(Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareCall(sql)){
//            for(int i = 0 ; i < objects.length ; i++){
//                ps.setObject(i+1, objects[i]);
//            }
//            affectedRow = ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return affectedRow;
//    }  
//    
//    public static ResultSet executeQuery(String sql, Object... objects){
// 
//        try(Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareCall(sql)){
//            for(int i = 0 ; i < objects.length ; i++){
//                ps.setObject(i+1, objects[i]);
//            }
//            ResultSet rs = ps.executeQuery();
//            return rs;
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
    private Connection _connection;
    private PreparedStatement _preparedStatement;
    private ResultSet _resultSet;
    
    /**
     * @param method
    * @param sql câu lệnh SELECT
    * @param args danh sách các tham số truyền vào cùng
    * 
    * @return danh sách kết quả truy vấn dạng ResultSet
    */
    public ResultSet executeQuery(String sql, Object... args) {
        try {
            _connection = DBConnection.getConnection();
            _preparedStatement = _connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                _preparedStatement.setObject(i + 1, args[i]);
            }
            _resultSet = _preparedStatement.executeQuery();
            
        } catch (Exception ex) {
            System.out.println("Lỗi truy vấn câu lệnh: " + sql);
            release(_resultSet, _preparedStatement, _connection);
        }
        
        return _resultSet;
    }

    @Override
    public void close() {
        release(_resultSet, _preparedStatement, _connection);
    }
    
    /**
    * @param sql câu lệnh INSERT, UPDATE, DELETE
    * @param args danh sách các tham số truyền vào cùng
    * 
    * @return số bản ghi trong DB được thay đổi
    */
    public static Integer executeUpdate(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement preparedstatement = null;
        Integer affectedRows = null;
        
        try {
            connection = DBConnection.getConnection();
            preparedstatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedstatement.setObject(i + 1, args[i]);
            }
            affectedRows = preparedstatement.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Lỗi thực thi câu lệnh: " + sql);
        } finally {
            release(preparedstatement, connection);
        }

        return affectedRows;
    }
    
    /**
    * @description đóng kết nối
    * 
    * @param statement đối tượng Statement
    * @param connection đối tượng Connection
    */
    private static void release(Statement statement, Connection connection) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Không đóng được Statement");
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e2) {
                System.out.println("Không đóng được Connection");
            }
        }
    }

    /**
    * @description đóng kết nối
    * 
    * @param resultSet đối tượng ResultSet
    * @param statement đối tượng Statement
    * @param conn đối tượng Connection
    */
    private static void release(ResultSet resultSet, 
            Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("Không đóng được ResultSet");
            }
        }
        release(statement, connection);
    }
}
