package com.example.lenovo.dhuwi_1202154348_modul3;

/**
 * Created by LENOVO on 25/02/2018.
 */

public class Air {
    String nama; String detail; int baack;

    public Air (String nama, String detail, int baack) {
        this.nama = nama;
        this.detail = detail;
        this.baack = baack;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getBaack() {
        return baack;
    }

    public void setBaack(int baack) {
        this.baack = baack;
    }
}


