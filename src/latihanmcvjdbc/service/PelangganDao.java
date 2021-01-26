/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmcvjdbc.service;

import java.util.List;
import latihanmcvjdbc.entity.Pelanggan;
import latihanmcvjdbc.error.PelangganException;

/**
 *
 * @author Zetro
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan Pelanggan) throws PelangganException;
    public void updatePelanggan(Pelanggan Pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(String Email) throws PelangganException;
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
