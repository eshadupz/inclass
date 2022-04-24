public interface Measurable
{
   double getMeasurement();

   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasurement();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
   }

   /**
      Finds the Measurable object with the largest measurement of a given list of objects.
      @param objects an array of Measurable objects
      @return the Measurable object with maximum/largest value, null if array is empty
   */

   static Measurable max(Measurable[] objects) {
      if (objects.length == 0)
      {
         return null;
      }
      Measurable largestFar = objects[0];
      for (int i = 1; i < objects.length; i++)
      {
         if (objects[i].getMeasurement() > largestFar.getMeasurement())
         {
            largestFar = objects[i];
         }
      }
      return largestFar;
   }
}
