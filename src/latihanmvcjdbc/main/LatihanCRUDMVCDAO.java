/*
NIM : 10116397
NAMA : MUHAMMAD AZRAQI SAPUTRA
KELAS : PBO2
 */
package latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import latihanmcvjdbc.database.KingBarberShopDatabase;
import latihanmcvjdbc.entity.Pelanggan;
import latihanmcvjdbc.error.PelangganException;
import latihanmcvjdbc.service.PelangganDao;
import latihanmcvjdbc.view.MainViewPelanggan;

/**
 *
 * @author Zetro
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}