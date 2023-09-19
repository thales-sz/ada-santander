import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SpecialEvents {
  public LocalDate firstEvent() {
    LocalDate birthDate = LocalDate.of(2000, 10, 31);
    return birthDate;
  }

  public LocalTime secondEvent() {
    LocalTime lunchTime = LocalTime.of(12, 0, 0);
    return lunchTime;
  }

  public LocalDateTime thirdEvent() {
    LocalDateTime reveillonCF = LocalDateTime.of(2019, 12, 31, 23, 59, 59);
    return reveillonCF;
  }
}
