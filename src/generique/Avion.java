package generique;

public class Avion {
	private int AVNUM;
	private String AVNOM;
	private int CAPACITE  ;
	private String VILLE;
	
	public Avion(int aVNUM, String aVNOM, int cAPACITE, String vILLE) {
		super();
		AVNUM = aVNUM;
		AVNOM = aVNOM;
		CAPACITE = cAPACITE;
		VILLE = vILLE;
	}
	public int getAVNUM() {
		return AVNUM;
	}
	public void setAVNUM(int aVNUM) {
		AVNUM = aVNUM;
	}
	public String getAVNOM() {
		return AVNOM;
	}
	public void setAVNOM(String aVNOM) {
		AVNOM = aVNOM;
	}
	public int getCAPACITE() {
		return CAPACITE;
	}
	public void setCAPACITE(int cAPACITE) {
		CAPACITE = cAPACITE;
	}
	public String getVILLE() {
		return VILLE;
	}
	public void setVILLE(String vILLE) {
		VILLE = vILLE;
	}

}
