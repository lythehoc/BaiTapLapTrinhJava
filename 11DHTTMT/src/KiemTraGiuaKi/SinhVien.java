/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiemTraGiuaKi;

/**
 *
 * @author userabc
 */
public class SinhVien {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    private String MaSV;
    private String Ho_Ten;
    private String Nam_Sinh;

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setHo_Ten(String Ho_Ten) {
        this.Ho_Ten = Ho_Ten;
    }

    public void setNam_Sinh(String Nam_Sinh) {
        this.Nam_Sinh = Nam_Sinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getHo_Ten() {
        return Ho_Ten;
    }

    public String getNam_Sinh() {
        return Nam_Sinh;
    }
}
   