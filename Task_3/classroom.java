
public class classroom {
	private int dayIndex;
	private int hourIndex;
	private String course_name;
	public classroom(int dayIndex, int hourIndex, String name) {
		this.dayIndex = dayIndex;
		this.hourIndex = hourIndex;
		this.course_name = name;
	}
	public String getInfo() {
		return dayIndex + " "+ hourIndex + " " + course_name;
		}
	}