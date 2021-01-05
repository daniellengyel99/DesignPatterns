package rouvt.models;

public class FirstObserver implements Observer{
    @Override
    public void update(String oldValue, String newValue) {
        System.out.println("old value: "+oldValue+" and new value: "+newValue);
    }
}
