package modul34;

public class mainKiw {
    private String jenis;
    private String ras1;
    private int jumlah1;
    private int dosis1;
    private String ras2;
    private int jumlah2;
    private int dosis2;

    public mainKiw(){
        jenis="";
        jumlah1=0;
        ras1="";
        ras2="";
        jumlah2=0;
        dosis1=0;
        dosis2=0;
    }

    public mainKiw(String a, String b, String c, int d, int e, int f, int g){
        this.jenis=a;
        this.ras1=b;
        this.ras2=c;
        this.dosis1=d;
        this.dosis2=e;
        this.jumlah1=f;
        this.jumlah2=g;
    }
    public void setJenis(String a){
        jenis =a;
    }
    public void setRas1(String b){
        ras1 =b;
    }
    public void setRas2(String c){
        ras2 =c;
    }
    public void setDosis1(int d){
        dosis1=d;
    }
    public void setDosis2(int e){
        dosis2=e;
    }
    public void setJumlah1(int f){
        jumlah1=f;
    }
    public void setJumlah2(int g){
        jumlah2=g;
    }
    public static int totDosis(int jumlah1, int dosis1,int jumlah2, int dosis2){
        int totDos=(jumlah1*dosis1)+(jumlah2*dosis2);
        return totDos;
    }
    public void displayMessage(){
        System.out.println("Jenis \t: "+jenis);
        System.out.println("------------------------------------");
        System.out.println("Ras \t: "+ras1);
        System.out.println("Jumlah \t: "+jumlah1+"ekor");
        System.out.println("Dosis obat/ekor/hari \t: "+dosis1+"mL");
        System.out.println("------------------------------------");
        System.out.println("Ras \t: "+ras2);
        System.out.println("Jumlah \t: "+jumlah2+"ekor");
        System.out.println("Dosis obat/ekor/hari \t: "+dosis2+"mL");
        System.out.println("------------------------------------");
        System.out.println("Jumlah dosis obat/hari \t: "+(jumlah1*dosis1)+"mL");
        System.out.println("Jumlah dosis obat/hari \t: "+(jumlah2*dosis2)+"mL");
        System.out.println("Total dosis obat/hari \t: "+totDosis(jumlah1, dosis1, jumlah2, dosis2)+"mL");
        System.out.println("=====================================\n");
    }
}
