import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
  List<LocalDate> datas = new ArrayList<>(); 

  public void execute() {
    System.out.println("\nExercício 02\n");
    datas.add(LocalDate.of(2023, 8, 10)); 
    datas.add(LocalDate.of(2022, 5, 20)); 
    datas.add(LocalDate.of(2021, 11, 30));

    List<String> formattedDates = this.formatDates(this.datas);
    for (String formattedDate : formattedDates) {
      System.out.println(formattedDate);
    }
  }

  public List<String> formatDates(List<LocalDate> dates) {
    List<String> formattedDates = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    for (LocalDate date : dates) {
      formattedDates.add(date.format(formatter));
    }
    return formattedDates;
  }
}
