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
  }
}
