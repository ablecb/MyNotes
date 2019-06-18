package ys;

public class Que {
	
	private int id;
	private String title;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Que [id=" + id + ", title=" + title + ", time=" + time + "]";
	}
	
	
	
	
}
