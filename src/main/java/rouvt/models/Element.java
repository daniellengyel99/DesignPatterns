package rouvt.models;

public interface Element {

    public void print();
    public void accept(Visitor visitor);
    void setNewValue(String newValue);

}
