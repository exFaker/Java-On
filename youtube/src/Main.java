//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int i = 10000;
        double j = 100.0;
        long  k = 10;
        String r = "ramon";

        //minja 01
        Uzumaki naruto = new Uzumaki();
        naruto.name = "naruto uzumaki";
        naruto.aldeia = "konora";
        naruto.protagonismo();

        //ninja 02
        Uchiras sasuke = new Uchiras();
        sasuke.name = "sasuke Uchira";
        sasuke.aldeia = "konora";
        sasuke.charing();

        //ninja 03
        Lee gai = new Lee();
        gai.name = "gai lee";
        gai.aldeia = "konora";
        gai.Agreção();


        System.out.println(naruto.name +" "+ naruto.aldeia);
        System.out.println(sasuke.name +" "+ sasuke.aldeia);
        System.out.println(gai.name +" "+ gai.aldeia);


    }
     public static void TentandoJava(String nome) {

        System.out.println("Hello Java, yo to lutando com voce! ");

    }
}