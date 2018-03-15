/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.List;

/**
 *
 * @author luana.155217
 */
public class Professor extends Pessoa {
   private List<Disciplina> Disciplina;
   private int CargaHoraria;
   private float ValorHora;
   private float Salario;
   
   public Professor ( int CargaHoraria, float ValorHora, float Salario, String nome, String rg, String cpf) { 
      
       this.CargaHoraria=CargaHoraria;
       this.ValorHora=ValorHora;
       this.Salario= CalculaSalario (ValorHora,CargaHoraria); 
       
       /**
        * param ValorHora
        * param CargaHoraria
        * return
        */
       
       
       public float CalculaSalario(float ValorHora,CargaHoraria){
           
         return ValorHora*CargaHoraria; 
       }
       
       
       
}


