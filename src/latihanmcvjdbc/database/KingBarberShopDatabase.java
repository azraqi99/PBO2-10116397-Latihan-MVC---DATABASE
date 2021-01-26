/*
NIM : 10116397
NAMA : MUHAMMAD AZRAQI SAPUTRA
KELAS : PBO2
 */
package latihanmcvjdbc.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import latihanmcvjdbc.impl.PelangganDaoImpl;
import latihanmcvjdbc.service.PelangganDao;

/**
 *
 * @author Zetro
 */
public class KingBarberShopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static  Connection getConnection() throws SQLException{
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
        }
           return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl (getConnection());
        }
        return pelangganDao;
    }
}