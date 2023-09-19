import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class VaccineSchedule {
  public void execute(LocalDate firstDose) {
    System.out.println("Primeira dose: " + firstDose);
    System.out.println("Segunda dose: " + firstDose.plusMonths(1));
    System.out.println("Terceira dose: " + firstDose.plusMonths(2));

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Quarta dose: " + format.format(firstDose.plusMonths(3)));
  }
}
