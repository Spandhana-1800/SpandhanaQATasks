package edu.nyu.objects;

public class TimeSample {
	private int hour;
	private int minute;
	private int second;
	
	TimeSample (int h,int m,int s){
		this.hour=((h>=0  && h<24)? h : 0);
		this.minute=((m>=0  && m<60)? m : 0);
		this.second=((s>=0  && s<60)? s: 0);
	}
	public String ShowSampleTime(){
		return (hour+":"+minute+":"+second);
            		
	}
	

}
