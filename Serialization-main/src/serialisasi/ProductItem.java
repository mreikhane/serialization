/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
/**
 *
 * @author daffa
 */

public class ProductItem implements Serializable {    
    String nama;
    double harga;
    String jenis;
    
    public ProductItem(String name, double harga, String jenis) {
        this.nama = name;
        this.harga = harga;
        this.jenis = jenis;
    }
    
    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\nJenis=" + jenis;
    }
}

