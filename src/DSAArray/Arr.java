package DSAArray;

import java.util.Arrays;

public class Arr
{
    public static void main( String[] args )
    {
        int[] intArr = new int[3];
        intArr[0] = 34;
        intArr[1] = 78;
        System.out.println( Arrays.toString( intArr ) );
        // One liner array creation
        int[] newArr = { 1, 2, 3 };
        System.out.println( Arrays.toString( newArr ) );
        SingleDimentionArray sda = new SingleDimentionArray( 5 );
        sda.insert( 3, 45 );
        sda.insert( 4, 65 );
        sda.insert( 5, 75 );
        sda.insert( 6, 85 );
        System.out.println( Arrays.toString( sda.getArr() ) );
    }
}
