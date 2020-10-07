package automotive;
import java.util.ArrayList;
import java.util.List;


public class ScheduleController {
	List<Schedule> schedule = new ArrayList<>();
	
	public void Register_schedule(String id, String date, String hour) {
			this.schedule.add(new Schedule(id, date, hour));
	}
	
	public void Listing_Schedule() {
		this.schedule.forEach(client -> System.out.println(client));
		if(schedule.isEmpty()) {
			System.out.println("\n=-=-  Nao ha agendamentos no sistema.  -=-=");
		}
	}
}