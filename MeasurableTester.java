/**
   This program demonstrates the measurable Country class.
*/
package Interface;

public class MeasurableTester {
   public static void main(String[] args) {
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      Measurable maxCountry = Measurable.max(countries);
      System.out.println("Maximum area: " + maxCountry.getMeasurement());
      System.out.println("Expected: 513120");
      System.out.println("The average surface area of these countries are: " + Measurable.average(countries));
      Arrays.sort(countries);
      System.out.println(Arrays.asList(countries).toString());

      Measurable[] midterms = new Measurable[10];
      midterms[0] = new Midterm(67, "Esha");
      midterms[1] = new Midterm(75, "Hana");
      midterms[2] = new Midterm(80, "Sunny");
      midterms[3] = new Midterm(90, "Nick");
      midterms[4] = new Midterm(95, "Lucy");
      midterms[5] = new Midterm(73, "Jordan");
      midterms[6] = new Midterm(74, "Natalie");
      midterms[7] = new Midterm(76, "Cathy");
      midterms[8] = new Midterm(77, "Diego");
      midterms[9] = new Midterm(78, "Antony");
      midterms[10] = new Midterm(79, "Mark");

      System.out.println("Name:" + max.getName());
      System.out.println("Score:" + max.getScore());
      Arrays.sort(midterms);
      System.out.println(Arrays.asList(midterms).toString());
      ;
   }
}
