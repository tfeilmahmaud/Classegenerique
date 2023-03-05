package generique;

public class Pilote {
	private int PLNUM;
	private String PLNOM;
	private String PLPRENOM;
	private String VILLE;
	private int SALAIRE ;
	
	
	public Pilote(int pLNUM, String pLNOM, String pLPRENOM, String vILLE, int sALAIRE) {
		//super();
		PLNUM = pLNUM;
		PLNOM = pLNOM;
		PLPRENOM = pLPRENOM;
		VILLE = vILLE;
		SALAIRE = sALAIRE;
	}
	public int getPLNUM() {
		return PLNUM;
	}
	public void setPLNUM(int pLNUM) {
		PLNUM = pLNUM;
	}
	public String getPLNOM() {
		return PLNOM;
	}
	public void setPLNOM(String pLNOM) {
		PLNOM = pLNOM;
	}
	public String getPLPRENOM() {
		return PLPRENOM;
	}
	public void setPLPRENOM(String pLPRENOM) {
		PLPRENOM = pLPRENOM;
	}
	public String getVILLE() {
		return VILLE;
	}
	public void setVILLE(String vILLE) {
		VILLE = vILLE;
	}
	public int getSALAIRE() {
		return SALAIRE;
	}
	public void setSALAIRE(int sALAIRE) {
		SALAIRE = sALAIRE;
	}
}
