package DSAArray;

public class SingleDimentionArray
{
    int arr[] = null;

    public SingleDimentionArray( int size )
    {
        arr = new int[size];
        for( int i = 0; i < arr.length; i++ )
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public int[] getArr()
    {
        return this.arr;
    }

    public void insert( int loc, int val )
    {
        try
        {
            if( loc >= arr.length )
            {
                System.out.println( "Please enter correct index." );
                return;
            }
            if( arr[loc] == Integer.MIN_VALUE )
            {
                arr[loc] = val;
                System.out.println(
                        "Value " + val + " has been inserted successfully." );
            }
            else
            {
                System.out.println( "Cell " + loc + " is already occupied" );
            }
        }
        catch ( Exception e )
        {
            System.out.println( e );
        }
    }
}
