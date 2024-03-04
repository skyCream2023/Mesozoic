package apiEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Ex1 {

}

class dino{
	private String name;
	private int age;
	private LocalDate birthday;
	public dino(String name, int age, LocalDate birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public LocalDate getBirth() {
		return birthday;
	}
}



class EventKeeper{
	private HashMap<String, LocalDateTime> eventLog;
	
	public EventKeeper() {
		eventLog = new HashMap<>();
	}
	public void logEvent(String event, LocalDateTime eventTime) {
		eventLog.put(event, eventTime);
	}
}
