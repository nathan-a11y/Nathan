/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

import java.util.Scanner;

/**
 * Classe para exibir os métodos e atributos do caminhão
 * @author Carmem & Nathan
 */
public class Caminhao {
    private String cor;
    private String marca;
    private String tipoTransporte;
    
    //Retorna a cor do caminhão
    public String getCor() {
        return cor;
    }
    
    //Método que chama a cor do caminhão
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //Retorna a marca do caminhão
    public String getMarca() {
        return marca;
    }

    //Chama a marca do caminhão
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Retorna o que aquele caminhão é encarregado de transportar
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    //Chama o tipo de carga que o caminhão carrega
    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    //Método responsável por fazer o usuário informar a cor do caminhão
     public void cor(){
        System.out.println("Digite a cor: ");
        Scanner sc = new Scanner(System.in);
        String cor = sc.next();
        
}
     //Para o usuário informar a marca do caminhão
        public void marca(){
        System.out.println("Digite a marca: ");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        
}
        //Para o usuário iformar as cilindradas do caminhão
          public void cilindradas(){
        System.out.println("Digite as tipoTransporte: ");
        Scanner sc = new Scanner(System.in);
        String tipoTransporte = sc.next();
        
}
}
