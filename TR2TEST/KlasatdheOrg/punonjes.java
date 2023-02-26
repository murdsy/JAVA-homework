public class punonjes{
    private int numri;
    private String emri;
    private String mbiemri;
    private double rroga;

    public int getNumri(){
        return numri;
    }

    public void setNumri(int n){
        numri = n;
    }

    public String getMbiemri(){
        return mbiemri;
    }

    public void setMbiemri(String m){
        mbiemri = m;
    }

    public String getEmri(){
        return emri;
    }

    public void setEmri(String e){
        emri=e;
    }

    public double getRroga(){
        return rroga;
    }

    public void setRroga(double r){
        rroga=r;
    }

    public static void main(String[] args){
        punonjes punonjsi = new punonjes();

        punonjsi.setEmri("Bob");
        punonjsi.setMbiemri("rrizi");
        System.out.println(">> "+punonjsi.getEmri()+" "+punonjsi.getMbiemri());
    }
}