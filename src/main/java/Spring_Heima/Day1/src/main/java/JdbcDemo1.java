import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException {
        //注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc_flink", "root", "jiao901112");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc_flink", "root", "1");
        //获取数据库预处理对象
        PreparedStatement statement = connection.prepareStatement("select * from student");
        //执行sql
        ResultSet resultSet = statement.executeQuery();
        //遍历结果
        while (resultSet.next()) {
            System.out.println("name = " + resultSet.getString("name"));
        }
        //关闭
        resultSet.close();
        statement.close();
        connection.close();
    }
}
