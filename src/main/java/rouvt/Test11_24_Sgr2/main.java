package rouvt.Test11_24_Sgr2;

public class main {

    public static void main(String[]args){

    Director d1=new Director("Director1");
    Director d2=new Director("Director2");
    Txt txt1=new Txt("text1");
    txt1.setAlignStrategy(new AlignRight());
    d1.addContent(d2);
    d2.addContent(txt1);
    Mp3 mp3=new Mp3("music");
    Mp3 mp4=new Mp3("music1");
    Svg svg=new Svg("svg");
    d2.addContent(mp3);
    d1.addContent(svg);
    d1.addContent(mp4);
    Txt txt2=new Txt("text2");
    txt2.setAlignStrategy(new AlignCenter());
    d2.addContent(txt2);
    d1.print();

    FileSizes fileSizes=new FileSizes();
    d1.accept(fileSizes);
    fileSizes.printSizes();

//  Output:
//        Director name: Director1 and it's files:
//        Director name: Director2 and it's files:
//        text1>>>>
//        music
//        <<<<text2>>>>
//        svg
//        music1
//
//         The whole size of the files: 6055 Kb, across 2 directories.
//         Txt files size: 10 Kb, Svg files size: 45 Kb, Mp3 files size: 6000
//
//        Process finished with exit code 0

    }

}
