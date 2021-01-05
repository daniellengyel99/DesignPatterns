package rouvt.models;

public class SecondObserver implements Observer{
    @Override
    public void update(String oldValue, String newValue) {
        System.out.println("SECOND OBSERVER:= old value: "+oldValue+" and new value: "+newValue);
    }
}
