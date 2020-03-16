import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class followup {
    static int[] intArray = new int[]{ 3,6,27,59,89,119,179};
    static int child_age=17;
    static int j;
    // Declaring array literal
    public  static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        for (int i=0; i< intArray.length ; i++)
        {
            if(child_age<intArray[i])
            {
                 j=1;
            }

            if(j>0)
            {
                int new_value=intArray[i]-child_age;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar cal = Calendar.getInstance();
                //Displaying current date in the desired format
                System.out.println("Current Date: "+sdf.format(cal.getTime()));

                //Number of Days to add
                cal.add(Calendar.DAY_OF_MONTH, new_value);
                //Date after adding the days to the current date
                String newDate = sdf.format(cal.getTime());
                //Displaying the new Date after addition of Days to current date
                System.out.println("Date after Addition: "+newDate);
            }

            }
        }
    }





