package quis2;

public class Oviraptor extends Dinosaurus implements IBertelur{
    @Override
    public void makan(){
        System.out.println("Oviraptor hewan Karnivora memakan telur atau ikan");
    }
    @Override
    public void berjalan(){
        System.out.println("Oviraptor Berjalan berbunyi set set");
    }
    @Override
    public void Bertelur(){
        System.out.println("Oviraptor berkembang biak dengan bertelur");
    }
}