package servis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaysicDAO<T> {
    protected Connection connection;

    public BaysicDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p1", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public abstract T select (Long id) throws Exception;
            public abstract void insert(T t)throws SQLException;
            public abstract void delete(Long id);
            public abstract void update(T t);

}

