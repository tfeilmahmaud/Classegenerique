package generique;

public class Vol {
	private  int VOLNUM ;
	private  int PLNUM ;
	private  int AVNUM ;
	private String VILLEDEP;
	private String VILLEARR;
	private String HEUREDEP;
	private String HEUREARR;
	
	
	
	
	public Vol(int vOLNUM, int pLNUM, int aVNUM, String vILLEDEP, String vILLEARR, String hEUREDEP, String hEUREARR) {
		super();
		VOLNUM = vOLNUM;
		PLNUM = pLNUM;
		AVNUM = aVNUM;
		VILLEDEP = vILLEDEP;
		VILLEARR = vILLEARR;
		HEUREDEP = hEUREDEP;
		HEUREARR = hEUREARR;
	}
	public int getVOLNUM() {
		return VOLNUM;
	}
	public void setVOLNUM(int vOLNUM) {
		VOLNUM = vOLNUM;
	}
	public int getPLNUM() {
		return PLNUM;
	}
	public void setPLNUM(int pLNUM) {
		PLNUM = pLNUM;
	}
	public int getAVNUM() {
		return AVNUM;
	}
	public void setAVNUM(int aVNUM) {
		AVNUM = aVNUM;
	}
	public String getVILLEDEP() {
		return VILLEDEP;
	}
	public void setVILLEDEP(String vILLEDEP) {
		VILLEDEP = vILLEDEP;
	}
	public String getVILLEARR() {
		return VILLEARR;
	}
	public void setVILLEARR(String vILLEARR) {
		VILLEARR = vILLEARR;
	}
	public String getHEUREDEP() {
		return HEUREDEP;
	}
	public void setHEUREDEP(String hEUREDEP) {
		HEUREDEP = hEUREDEP;
	}
	public String getHEUREARR() {
		return HEUREARR;
	}
	public void setHEUREARR(String hEUREARR) {
		HEUREARR = hEUREARR;
	}

}
