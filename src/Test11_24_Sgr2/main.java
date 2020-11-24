package Test11_24_Sgr2;

import java.io.File;

public class main {

    public static void main(String[]args){

    Director d1=new Director("Director1");
    Director d2=new Director("Director2");
    Txt txt1=new Txt("text1");
    txt1.setAlignStrategy(new AlignRight());
    d1.addContent(d2);
    d2.addContent(txt1);
    Mp3 mp3=new Mp3("music");
    Svg svg=new Svg("svg");
    d2.addContent(mp3);
    d1.addContent(svg);
    Txt txt2=new Txt("text2");
    txt2.setAlignStrategy(new AlignCenter());
    d2.addContent(txt2);
    d1.print();

    FileSizes fileSizes=new FileSizes();
    d1.accept(fileSizes);
    fileSizes.printSizes();

    }

}
