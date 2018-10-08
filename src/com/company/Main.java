package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

public class Main {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
}
