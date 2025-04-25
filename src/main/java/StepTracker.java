import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps, totalSteps;
 private in totalDays, activeDays;

 public StepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  totalDays = 0;
  activeDays = 0;
 }
 public void addDailySteps(int steps) {
   totalSteps += stes;
   totalDays++;
  if(steps >= minSteps)
    activeDays++;
 }

 public int activeDays() {
   return activeDays;
 }
 public double averageSteps() {
  if(totalDays == 0)
    return 0.0;
  else
    return (double)totalSteps / totalDays;
 }
} 
