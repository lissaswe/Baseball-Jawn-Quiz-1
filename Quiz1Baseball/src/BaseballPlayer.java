public class BaseballPlayer {
	private int H;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int Doubles;
	private int Triples;
	private int HR;
	
	private int singles;
	private double BA;
	private double OBP;
	private double SLG;
	private double OPS;
	private double TB;
	
	BaseballPlayer(int hits, int AB, int BB, int HBP, int SF, int Doubles, int Triples, int HR)
	{
		this.H = hits;
		this.AB = AB;
		this.BB = BB;
		this.HBP = HBP;
		this.SF = SF;
		this.Doubles = Doubles;
		this.Triples = Triples;
		this.HR = HR;
		
		this.singles = this.H - this.Doubles - this.Triples - this.HR;
		this.BA = this.makeBA();
		this.OBP = this.makeOBP();
		this.SLG = this.makeSLG();
		this.OPS = this.makeOPS();
		this.TB = this.makeTB();
	}
	
	public double makeBA() {
		return (double)this.H/(double)this.AB;
	}
	public double makeOBP() {
		return ((double)this.H + (double)this.BB + (double)this.HBP)/((double)this.AB + (double)this.BB + (double)this.HBP + (double)this.SF);
	}
	public double makeSLG() {
		return (((double)this.singles + (2.0 * (double)this.Doubles + (3.0*(double)this.Triples) + (4.0*(double)this.HR))/(double)this.AB));
	}
	public double makeOPS() {
		return this.OBP + this.SLG;
	}
	public double makeTB() {
		return (double)this.singles + (2.0*(double)this.Doubles) + (3.0*(double)this.Triples) + (4.0*(double)this.HR);
	}
	public int getAB() {
		return AB;
	}

	public void setAB(int AB) {
		this.AB = AB;
	}

	public int getH() {
		return H;
	}

	public void setH(int H) {
		H = H;
	}

	public int getDoubles() {
		return Doubles;
	}

	public void setDoubles(int Doubles) {
		this.Doubles = Doubles;
	}

	public int getTriples() {
		return Triples;
	}

	public void setTriples(int Triples) {
		this.Triples = Triples;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int HR) {
		this.HR = HR;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int BB) {
		this.BB = BB;
	}

	public int getSF() {
		return SF;
	}

	public void setSF(int SF) {
		this.SF = SF;
	}

	public int getHBP() {
		return HBP;
	}

	public void setHBP(int HBP) {
		this.HBP = HBP;
	}

	public double getBA() {
		return this.BA;
	}
	public double getOBP() {
		return this.OBP;
	}
	public double getSLG() {
		return this.SLG;
	}
	public double getOPS() {
		return this.OPS;
	}
	public double getTB() {
		return this.TB;
	}
}
