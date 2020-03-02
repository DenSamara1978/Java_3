import java.util.ArrayList;
import java.util.List;

public class Box
{
    private List<Fruit> fruits = new ArrayList<Fruit> ();

    public float getWeight ()
    {
        float result = 0.0f;
        for ( Fruit elm: fruits )
            result += elm.getWeight ();
        return result;
    }

    public boolean compare ( Box arg )
    {
        return ( this.getWeight () == arg.getWeight ());
    }

    public boolean addFruit ( Fruit newFruit )
    {
        if ( fruits.isEmpty() || fruits.get ( 0 ).getClass().equals( newFruit.getClass()))
        {
            fruits.add(newFruit);
            return true;
        }
        else
            return false;
    }

    public boolean moveFruits ( Box targetBox )
    {
        if ( targetBox == this )
            return false;
        if ( this.fruits.isEmpty())
            return true;
        if (( targetBox.fruits.isEmpty()) || targetBox.fruits.get ( 0 ).getClass().equals( this.fruits.get(0).getClass()))
        {
            targetBox.fruits.addAll ( this.fruits );
            this.fruits.clear();
            return true;
        }
        return false;
    }
}
