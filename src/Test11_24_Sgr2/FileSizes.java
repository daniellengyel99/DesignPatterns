package Test11_24_Sgr2;

public class FileSizes implements Visitor{

    int totalSize=0,directoare=0;

    public void visit(Txt txt) {
        totalSize+=5;
    }
    public void visit(Mp3 mp3) {
        totalSize+=3000;
    }
    public void visit(Svg svg) {
        totalSize+=45;
    }

    public void visit(Director director){
        directoare++;
    }

    public void printSizes(){
        System.out.println("\n The whole size of the files: "+totalSize+" Kb, across "+directoare+" directories.");
    }

}
