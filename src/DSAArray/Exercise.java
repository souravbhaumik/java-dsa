package DSAArray;

import java.util.Scanner;

public class Exercise
{
    public static void main( String[] args )
    {
        calcAvgTemp();
    }

    /*
     * Take input of temperatures from the user. Average of those temperatures.
     * How many days are above average temperature.
     */
    private static void calcAvgTemp()
    {
        Scanner sc = new Scanner( System.in );
        System.out
                .println( "Dow many days temperature you want to calculate?" );
        float days = sc.nextInt();
        int[] tempArr = new int[(int)days];
        float totalTemp = 0;
        if( days <= 0 )
        {
            System.out.println( "Thanks for choosing us." );
            return;
        }
        for( int i = 0; i < days; i++ )
        {
            System.out
                    .println( "Day " + ( i + 1 ) + "'s highest temperature?" );
            float temp = tempArr[i] = sc.nextInt();
            totalTemp = totalTemp + temp;
        }
        float avg = totalTemp / days;
        int aboveTemp = 0;
        System.out.println( avg );
        for( int j : tempArr )
        {
            if( j > avg )
            {
                aboveTemp++;
            }
        }
        System.out.println( aboveTemp
                + " day's temperature is above average temperature." );
        sc.close();
    }
}
