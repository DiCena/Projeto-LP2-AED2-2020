package edu.ufp.inf.projeto;


import edu.princeton.cs.algs4.LinearProbingHashST;
import edu.princeton.cs.algs4.RedBlackBST;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluno extends Pessoa {

  private int numero;

  private RedBlackBST<Date,Turma> horario;

  private LinearProbingHashST<String, Turma> turmas;

  public Aluno(String nome, String email, Date data_nascimento, String morada, int numero) {
    super(nome, email, data_nascimento, morada);
    this.numero = numero;
  }

  public void matricula(String n) {
  }

  public void adicionarTurma(Turma t) {
    if (findTurma(t.codigo)!=null) {
      System.out.println("Aluno ja inscrito na turma!!");
    }
    else{
      getTurmas().put(t.codigo,t);
    }
  }

  public Turma removerTurma(String n) {
    Turma t = findTurma(n);
    if (t==null){
      System.out.println("Aluno nao inscrito na turma!");
      return null;
    }
    else{
      turmas.delete(n);
      return t;
    }
  }

  public Turma findTurma(String nome){
    return getTurmas().get(nome);
  }

  public ArrayList<Turma> findAulasDia(int d, Date lo, Date hi){
    ArrayList<Turma> aux = new ArrayList();
    for (Date di:horario.keys(lo, hi)) {
      if (di.getDias_semana()==d){
        aux.add(horario.get(di));
      }
    }
    return aux;
  }

  public Turma nextAula(){
    Turma aux;
    java.util.Date agora =  new java.util.Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(agora);
    Date date = new Date(calendar.get(Calendar.DAY_OF_WEEK), agora.getHours(), agora.getMinutes());
    ArrayList<Turma> turmas = findAulasDia(calendar.get(Calendar.DAY_OF_WEEK), date, new Date(calendar.get(Calendar.DAY_OF_WEEK), 23, 59));
    aux = turmas.get(0);
    for (Turma turma:turmas) {
      if(turma.getHora_inicio().isBefore(aux.getHora_inicio())){
        aux = turma;
      }
    }
    return aux;
  }

  /**
   *
   * Get & Set
   *
   * */

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public LinearProbingHashST<String, Turma> getTurmas() {
    return turmas;
  }

  public void setTurmas(LinearProbingHashST<String, Turma> turmas) {
    this.turmas = turmas;
  }

  public RedBlackBST<Date, Turma> getHorario() {
    return horario;
  }

  public void setHorario(RedBlackBST<Date, Turma> horario) {
    this.horario = horario;
  }

  @Override
  public String toString() {
    return "\nAluno{" +
            "\nnumero=" + numero +
            ", \nhorario=" + horario +
            ", \nturmas=" + turmas +
            '}';
  }
}