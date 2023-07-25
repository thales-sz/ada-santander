package aula06.src;

public class Aula06Desafio {
  public enum Semana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda-Feira"),
    TERCA("Terça-Feira"),
    QUARTA("Quarta-Feira"),
    QUINTA("Quinta-Feira"),
    SEXTA("Sexta-Feira"),
    SABADO("Sábado");

    String day;
    Semana(String day) {
      this.day = day;
    }

    public String getDay() {
      return this.day;
    }
  }

  public static void main(String[] args) {
    System.out.println(Semana.DOMINGO.getDay().equals("Domingo"));
    System.out.println(getDia("domingo") == Semana.DOMINGO);
  }

  public static Semana getDia(String dia) {
    return Semana.valueOf(dia.toUpperCase());
  }
}
