import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercicio03 {
  ZoneId newYork = ZoneId.of("America/New_York");
  ZoneId paris = ZoneId.of("Europe/Paris");
  ZoneId tokyo = ZoneId.of("Asia/Tokyo");

  ZonedDateTime zonedDateTime = ZonedDateTime.now();

  
  public void execute() {
    System.out.println("\nExercício 03\n");
    this.convertTimeZone();
  }

  // Crie um objeto do tipo ZonedDateTime e converta ele para os 3 fusos abaixo:
  public void convertTimeZone() {
    System.out.println("Converta o ZonedDateTime para os 3 fusos abaixo:");
    System.out.println("New York: " + this.zonedDateTime.withZoneSameInstant(this.newYork));
    System.out.println("Paris: " + this.zonedDateTime.withZoneSameInstant(this.paris));
    System.out.println("Tokyo: " + this.zonedDateTime.withZoneSameInstant(this.tokyo));
  }
}
