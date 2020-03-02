import java.lang.reflect.Array;
import java.util.ArrayList;

public class Launcher
{
    public static void main(String[] args)
    {
        Box box1 = new Box ();
        Box box2 = new Box ();
        Box box3 = new Box ();

        box1.addFruit( new Orange ());
        box1.addFruit( new Apple ());
        box1.addFruit( new Orange ());
        box1.addFruit( new Apple ());

        box2.addFruit( new Apple ());
        box2.addFruit( new Apple ());
        box2.addFruit( new Apple ());
        box2.addFruit( new Apple ());

        System.out.println( "Коробка1: " + box1.getWeight());
        System.out.println( "Коробка2: " + box2.getWeight());
        System.out.println( "Коробка3: " + box3.getWeight());
        System.out.println( "" );

        box1.moveFruits ( box3 );

        System.out.println( "Коробка1: " + box1.getWeight());
        System.out.println( "Коробка2: " + box2.getWeight());
        System.out.println( "Коробка3: " + box3.getWeight());
        System.out.println( "" );

        box2.moveFruits ( box3 );

        System.out.println( "Коробка1: " + box1.getWeight());
        System.out.println( "Коробка2: " + box2.getWeight());
        System.out.println( "Коробка3: " + box3.getWeight());
        System.out.println( "" );

    }

    public static final <T> void swapElements (T[] arr, int index1, int index2)
    {
        T t = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = t;
    }

    public static final <T> ArrayList<T> convertArray(T[] arr )
    {
        ArrayList<T> newArray = new ArrayList<T> ();
        for ( T elm: arr)
            newArray.add ( elm );
        return newArray;
    }
}
