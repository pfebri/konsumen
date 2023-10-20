package com.maven.web.model;

import java.util.*;

public class Konsumen {
    private int id;
    private String nama;
    private String alamat;
    private String kota;
    private String provinsi;
    private Date tgl_registrasi;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Date getTgl_registrasi() {
        return tgl_registrasi;
    }

    public void setTgl_registrasi(Date tgl_registrasi) {
        this.tgl_registrasi = tgl_registrasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}