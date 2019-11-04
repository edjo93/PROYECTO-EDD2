/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardfilemanager;

/**
 *
 * @author edas
 */
enum TipoCampo{CHAR,INTF,DEC};

public class Campo {
    private final char []name=new char[30];
    private TipoCampo tipoCampo;
    private int size;
    private int size_dec;
    private boolean key;
    
    //constructor 
    
    
    public TipoCampo getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(TipoCampo tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize_dec() {
        return size_dec;
    }

    public void setSize_dec(int size_dec) {
        this.size_dec = size_dec;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
    
    
    
}   
