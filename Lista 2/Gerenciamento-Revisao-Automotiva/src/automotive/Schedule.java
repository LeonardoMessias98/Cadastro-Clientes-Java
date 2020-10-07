package automotive;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Schedule implements Serializable{
	public String id;
	public String date;
	public String hour;
		
	public Schedule(String id, String date, String hour) {
		this.id = id;
		this.date = date;
		this.hour = hour;
	}
		
	@Override
	public String toString() {
		
		String info =
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"  Agendamentos  " + 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +		
				"\nID do cliente: " + id + 
				"\nData: " + date + 
				"\nHorario: " + hour +
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=";
		
		return info;
	}	
}