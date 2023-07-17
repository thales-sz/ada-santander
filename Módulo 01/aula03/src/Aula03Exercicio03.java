public class Aula03Exercicio03 {
  public static void main(String[] args) {
    double[] input = { 10, 2, 1500 };

    System.out.println(calculoSalario(input));
  }

  public static double calculoSalario( double[] input) {
    double years = input[0];
    double inflation = input[1];
    double salary = input[2];

    double result = 0.0;
        
    double inflationValue = salary * (inflation/100);


    if (years >= 1 && years < 5) {
        result = (salary * 1/100) + inflationValue;
    } else if (years >= 5 && years < 10) {
        result = (salary * 1.5/100) + inflationValue;
    } else if (years >= 10) {
        result = (salary * 2/100) + inflationValue;
    }

    return result + salary;
  }

   
}