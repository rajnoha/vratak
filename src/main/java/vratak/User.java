package vratak;

public class User {
	private Long id;
	private String chipId;
	private String meno;
	private boolean active = true ;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getChipId() {
		return chipId;
	}
	public void setChipId(String chipId) {
		this.chipId = chipId;
	}
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", chipId=" + chipId + ", meno=" + meno + ", active=" + active + "]";
	}
	
}
