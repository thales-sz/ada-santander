import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    VaccineSchedule vaccineSchedule = new VaccineSchedule();
    System.out.println("Bem vindo(a) ao sistema de agendamento de vacinas!");
    System.out.println("Por favor, informe a data da primeira dose:");
    System.out.println("Dia:");
    int day = sc.nextInt();
    System.out.println("Mês:");
    int month = sc.nextInt();
    System.out.println("Ano:");
    int year = sc.nextInt();
    LocalDate firstDose = LocalDate.of(year, month, day);
    vaccineSchedule.execute(firstDose);
    sc.close();

    exercicio01();
    exercicio02();
    exercicio03();
  }

  public static void exercicio01() {
    Exercicio01 exercicio01 = new Exercicio01();
    exercicio01.execute();
  }

  public static void exercicio02() {
    Exercicio02aula02 exercicio02 = new Exercicio02aula02();
    exercicio02.execute();
  }

  public static void exercicio03() {
    Exercicio03aula02 exercicio03 = new Exercicio03aula02();
    exercicio03.execute();
  }
}
