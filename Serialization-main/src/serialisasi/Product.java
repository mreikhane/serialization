/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author daffa
 */
public class Product implements Serializable {
    
    private transient String id;
    private static String nama;
    private String jenisproduk;
    private List <ProductItem> items;
    
    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenisProduk) {
        this.jenisproduk= jenisproduk;
    }
    

    public void setItems(List<ProductItem> items) {
        this.items = items;
    }
    

    @Override
            public String toString() {
          String produk, item = "";
          produk = "Produk: \r\n"
          + "Id=" + id + "\r\n"
          + "Nama=" + nama + "\r\n"
          + "=======================\r\n"
          + "Product Item:\r\n";
          item = items.stream().map((obj) -> 
         obj.toString()).reduce(item, String::concat);
          return produk + item;
          }
}