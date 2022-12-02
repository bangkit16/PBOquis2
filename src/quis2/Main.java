package quis2;

public class Main {
    public static void main(String[] args) {
        
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops tric = new Triceratops();
        Oviraptor ovi = new Oviraptor();
        
        Pemburu pemb = new Pemburu();
        AnakPemburu anakpemb = new AnakPemburu();
        
        trex.makan();
        trex.berjalan();
        System.out.println("------------------");   

        tric.makan();
        tric.berjalan();
        System.out.println("------------------");   

        ovi.makan();
        ovi.berjalan();
        ovi.Bertelur();
        System.out.println("------------------");   

        pemb.berburu(trex);
        anakpemb.mengambilTelur(ovi);
    }

}
