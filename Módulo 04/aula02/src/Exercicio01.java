import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
  List<String> stringDates = new ArrayList<>();

  public void execute() {
    System.out.println("\nExercício 01\n");
    this.stringDates.add("2023-08-10");
    this.stringDates.add("2022-05-20");
    this.stringDates.add("2021-11-30");

    List<LocalDate> localDates = this.convertStringDatesToLocalDates(this.stringDates);
    for (LocalDate localDate : localDates) {
      System.out.println(localDate);
    }
  }

  public List<LocalDate> convertStringDatesToLocalDates(List<String> stringDates) {
    List<LocalDate> localDates = new ArrayList<>();
    for (String stringDate : stringDates) {
      localDates.add(LocalDate.parse(stringDate));
    }
    return localDates;
  }
}
