package quis2;

public class AnakPemburu implements IMengambilTelur{
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println("Anak Pemburu sedang mengambil telur dinosaurus " + dino.getClass().getSimpleName());
    }
}
