package javaplus.generic;

public class Sample<T> {
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;

    }
    @Override
    public String toString(){
        return "Sample{" + "value = " + value + '}';
    }
}
