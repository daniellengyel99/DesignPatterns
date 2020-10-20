public class Image implements Element{

    private String name;

    Image(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("Image with name: "+this.name);
    }

}
