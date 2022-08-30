/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author christhofer.vieira
 */
public class barco {
    String cor;
    String tipo;
    double tamanho;
    
    void imprimeDadosBarco(){
        System.out.println("");
        System.out.println("----------Barco---------");
        System.out.println("Cor: "+cor);
        System.out.println("Tipo: "+tipo);
        System.out.println("tamanho em mts: "+tamanho);
    }
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public double getTamanho() {
        return tamanho;
    }

    public void setTipo(double tamanho) {
        this.tamanho = tamanho;
    }
        
}
