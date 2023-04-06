package modul34;

public class pakKiw {
    public static void main(String[] args) {
        mainKiw bebek=new mainKiw();
        bebek.setJenis("Bebek");
        bebek.setRas1("Telur biasa");
        bebek.setJumlah1(15);
        bebek.setDosis1(5);
        bebek.setRas2("Telur asin");
        bebek.setJumlah2(10);
        bebek.setDosis2(8);
        bebek.displayMessage();

        mainKiw unta=new mainKiw();
        unta.setJenis("Unta");
        unta.setRas1("Susu putih");
        unta.setJumlah1(3);
        unta.setDosis1(10);
        unta.setRas2("Susu coklat");
        unta.setJumlah2(4);
        unta.setDosis2(15);
        unta.displayMessage();

        mainKiw domba=new mainKiw();
        domba.setJenis("Domba");
        domba.setRas1("Bulu hitam");
        domba.setJumlah1(4);
        domba.setDosis1(9);
        domba.setRas2("Bulu putih");
        domba.setJumlah2(6);
        domba.setDosis2(14);
        domba.displayMessage();
    }
}
