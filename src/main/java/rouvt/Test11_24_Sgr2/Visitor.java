package rouvt.Test11_24_Sgr2;

public interface Visitor {

    void visit(Txt txt);
    void visit(Mp3 mp3);
    void visit(Svg svg);
    void visit(Director director);

}
