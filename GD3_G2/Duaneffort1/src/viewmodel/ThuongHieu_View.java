/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author baphuoc
 */
public class ThuongHieu_View {
    private int stt;
    private String ma;
    private String ten;

    public ThuongHieu_View() {
    }

    public ThuongHieu_View(int stt, String ma, String ten) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
}
