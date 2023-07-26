package aula07.src;

import aula07.src.utils.InvalidWeekDayException;

public enum Semana {
    DOMINGO(1, new String[] { "Domingo", "dm", "d" }),
    SEGUNDA(2, new String[] { "Segunda-Feira", "seg", "s", "segunda" }),
    TERCA(3, new String[] { "Terça-feira", "terça", "terca", "ter" }),
    QUARTA(4, new String[] { "Quarta-feira", "quarta", "qua" }),
    QUINTA(5, new String[] { "Quinta-feira", "quinta", "qui" }),
    SEXTA(6, new String[] { "Sexta-feira", "sexta", "sxt", "sex" }),
    SABADO(7, new String[] { "Sábado", "sab", "sábado", "sabado", "sáb" });

    final String[] keywords;
    final int value;

    Semana(int value, String[] keywords) {
      this.value = value;
      this.keywords = keywords;
    }

    public String getName() {
      return this.keywords[0];
    }

    public static void getWeekDay(String userInput) throws InvalidWeekDayException {
      for (Semana day : Semana.values()) {
        for (String keyword : day.keywords) {
          if (keyword.equalsIgnoreCase(userInput)) {
            System.out.printf("O dia da semana é: %s", day.getName());
            System.exit(0);
          }
        }
      }
      throw new InvalidWeekDayException("Dia da semana inválido!");
    }
  }
