public class test_punonjes {
    public static void main(String[] args){
        punonjes p = new punonjes();
        p.setEmri("andi");
        p.setMbiemri("gjati");
        p.setRroga(345555.5);
        p.setNumri(69);

        System.out.println("Punonjesi "
	    	+p.getEmri()+" "
	    	+p.getMbiemri()+" ka kodin "
	    	+p.getNumri()+" dhe rrogen "
	    	+p.getRroga());

        
    }
}
