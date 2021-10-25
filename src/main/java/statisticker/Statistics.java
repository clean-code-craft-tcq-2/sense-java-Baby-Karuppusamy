package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{
    public static class Stats{
        float min = Float.NaN;
        float max = Float.NaN;;
        float average = Float.NaN;;
        
        Stats(List<Float> numbers){
            if(!numbers.isEmpty())
            {
                this.min = Collections.min(numbers);
                this.max = Collections.max(numbers);
                this.average = getAverage(numbers);
            }
        }
        
        private Float getAverage(List<Float> numbers){
            Float sum=0.0f;
            for (Float number : numbers) {
                sum += number;
            }
            return sum/numbers.size();
        }
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        return new Stats(numbers);
    }
}
