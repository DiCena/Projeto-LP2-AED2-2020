package edu.ufp.inf.projeto;

import java.util.ArrayList;


public class Universidade {

  private String nome;

  private ArrayList alunos;

  private ArrayList professores;

  private ArrayList unidades_curriculares;

  private ArrayList<Sala> salas;


  public Universidade(String nome, ArrayList alunos, ArrayList professores, ArrayList unidades_curriculares, ArrayList<Sala> salas) {
    this.nome = nome;
    this.alunos = alunos;
    this.professores = professores;
    this.unidades_curriculares = unidades_curriculares;
    this.salas = salas;
  }

  public Universidade(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList alunos) {
    this.alunos = alunos;
  }

  public ArrayList getProfessores() {
    return professores;
  }

  public void setProfessores(ArrayList professores) {
    this.professores = professores;
  }

  public ArrayList getUnidades_curriculares() {
    return unidades_curriculares;
  }

  public void setUnidades_curriculares(ArrayList unidades_curriculares) {
    this.unidades_curriculares = unidades_curriculares;
  }

  public ArrayList<Sala> getSalas() {
    return salas;
  }

  public void setSalas(ArrayList<Sala> salas) {
    this.salas = salas;
  }

    @Override
    public String toString() {
        return "\nUniversidade{" +
                "\nnome='" + nome + '\'' +
                ", \nalunos=" + alunos +
                ", \nprofessores=" + professores +
                ", \nunidades_curriculares=" + unidades_curriculares +
                ", \nsalas=" + salas +
                '}';
    }
}