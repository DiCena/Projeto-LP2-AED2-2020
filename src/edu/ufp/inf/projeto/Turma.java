package edu.ufp.inf.projeto;

import java.util.ArrayList;
import java.util.Vector;


public class Turma {

  String codigo;
  private Date hora_inicio;
  private Date hora_fim;

    private Professor professor;
    private Sala sala;

  private ArrayList<Aluno> alunos;

    public Turma(String codigo, Date hora_inicio, Date hora_fim, Professor professor, Sala sala) {
        this.codigo = codigo;
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
        this.professor = professor;
        this.sala = sala;
    }

    public void modifyTime(Date i, Date f){
    this.hora_inicio = i;
    this.hora_fim = f;
  }

  public void adicionarAluno(String c) {
  }

  public void removerAluno(String c) {
  }

  public boolean isInterseptedBy(Turma turma){
    return turma.getHora_inicio().isBetween(this.hora_inicio, this.hora_fim) || turma.getHora_fim().isBetween(this.hora_inicio, this.hora_fim);
  }

  public void modifySala(Sala s){
    this.sala = s;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public ArrayList<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList<Aluno> alunos) {
    this.alunos = alunos;
  }

  public Date getHora_inicio() {
    return hora_inicio;
  }

  public void setHora_inicio(Date hora_inicio) {
    this.hora_inicio = hora_inicio;
  }

  public Date getHora_fim() {
    return hora_fim;
  }

  public void setHora_fim(Date hora_fim) {
    this.hora_fim = hora_fim;
  }

  public Sala getSala() {
    return sala;
  }

  public void setSala(Sala sala) {
    this.sala = sala;
  }

    @Override
    public String toString() {
        return "\nTurma{" +
                "\ncodigo='" + codigo + '\'' +
                ", \nhora_inicio=" + hora_inicio +
                ", \nhora_fim=" + hora_fim +
                ", \nprofessor=" + professor +
                ", \nsala=" + sala +
                ", \nalunos=" + alunos +
                '}';
    }
}





