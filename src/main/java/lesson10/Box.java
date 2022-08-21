package lesson10;

public class Box<T extends Fruit> {

    private T[] array;

    public Box(T ... array) {
        this.array = array;
    }


    public double getWeightBox(Fruit fruit) {
        return fruit.getWeight() * (array.length);
    }

    public boolean compare(Box tBox){
        if(this.getWeightBox(this.array[0]) == tBox.getWeightBox(tBox.array[0])){
            return true;
        } else {
            return false;
        }
    }

}
