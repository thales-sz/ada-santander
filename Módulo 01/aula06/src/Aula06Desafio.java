package aula06.src;

public class Aula06Desafio {
  public enum Semana {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-Feira"),
    TERCA(3, "Terça-Feira"),
    QUARTA(4, "Quarta-Feira"),
    QUINTA(5, "Quinta-Feira"),
    SEXTA(6, "Sexta-Feira"),
    SABADO(7, "Sábado");

    final String day;
    final int value;

    Semana(int value, String day) {
      this.value = value;
      this.day = day;
    }

    public String getDay() {
      return this.day;
    }
  }

  public static void main(String[] args) {
    System.out.println(Semana.DOMINGO.getDay().equalsIgnoreCase("Domingo"));
    System.out.println(getDia("domingo") == Semana.DOMINGO);
  }

  public static Semana getDia(String dia) {
    return Semana.valueOf(dia);
  }
}
