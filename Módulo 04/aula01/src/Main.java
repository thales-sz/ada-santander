public class Main {
  public static void main(String[] args) {
    SpecialEvents events = new SpecialEvents();
    System.out.println("Nascimento: " + events.firstEvent());
    System.out.println("Hora do almoço: " + events.secondEvent());
    System.out.println("Reveillon 2019 em CF: " + events.thirdEvent());
  }
}
