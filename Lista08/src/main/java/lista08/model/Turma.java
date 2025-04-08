/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista08.model;

import java.util.ArrayList;


/**
 *
 * @author leandro
 */
public class Turma {
    private String disciplina;
    private Turno turno;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    
    public Aluno obterMelhorNotaEnem() {
        int posicaoMaior = 0;
        
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getNotaEnem() > alunos.get(posicaoMaior).getNotaEnem()){
                posicaoMaior = i;
            }
        }
       
        return alunos.get(posicaoMaior);
       
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    
}
