/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.Date;
import java.util.List;

/**
 *
 * @author luana.155217
 */
public class Aluno extends Pessoa {
    private int matricula;
    private Date dataMatricula;
    private List<Disciplina> Disciplina;

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", Disciplina=" + Disciplina + '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public List<Disciplina> getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(List<Disciplina> Disciplina) {
        this.Disciplina = Disciplina;
    }
     
    
    
}
