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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setCor("preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("QWE-1234");
        meuCarro.setTipo("Gol");
        
        System.out.println("-----------CARRO-----------");
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Nº Portas: "+meuCarro.getNumPortas());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Tipo: "+meuCarro.getTipo());
        
    }
    
}
