/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Riri
 */
public abstract class Orang {
    private int id;
    private String nama;
    private static int count=1;
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Orang.count = count;
    }
    
    public static void incCount(){
        Orang.count++;
    }
    
    public Orang(int id, String nama) {
        this.id=id;
        this.nama=nama;
    }

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

    @Override
    public abstract String toString();
    
    
}
