/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.TKThuocTinhSP_Model;

/**
 *
 * @author baphuoc
 */
public interface ITKThuocTinhSP_repos {
    List<TKThuocTinhSP_Model> tkByMa();
    List<TKThuocTinhSP_Model> tkByMa(String ma);
    List<TKThuocTinhSP_Model> tkByMaTheoNgay(String ma,String batDau,String ketThuc);
}
