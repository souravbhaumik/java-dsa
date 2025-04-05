import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result
{
    /*
     * Complete the 'getRemovableIndices' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * following parameters: 1. STRING str1 2. STRING str2
     */
    public static List< Integer > getRemovableIndices( String str1,
            String str2 )
    {
        List< Integer > remIndices = new ArrayList<>();
        String str3 = "";
        if( str1.length() == str2.length() )
        {
            return remIndices;
        }
        for( int i = 0; i < str1.length(); i++ )
        {
            str3 = str1.substring( 0, i ) + str1.substring( i + 1 );
            if( str3.equals( str2 ) )
            {
                remIndices.add( i );
            }
        }
        return remIndices.isEmpty() ? Arrays.asList( -1 ) : remIndices;
    }
}

public class GetRemovableIndices
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader( System.in ) );
        /*
         * String str1 = bufferedReader.readLine(); String str2 =
         * bufferedReader.readLine(); List< Integer > result =
         * Result.getRemovableIndices( str1, str2 ); System.out.println(
         * result.stream().map( Object::toString ) .collect( joining( "\n" ) )
         * );
         */
        List< Integer > result1 = Result.getRemovableIndices( "aabbb", "aabb" );
        List< Integer > result2 = Result.getRemovableIndices( "mmgghh",
                "mfggh" );
        System.out.println( result1.stream().map( Object::toString )
                .collect( joining( "\n" ) ) );
        System.out.println( result2.stream().map( Object::toString )
                .collect( joining( "\n" ) ) );
        bufferedReader.close();
    }
}
