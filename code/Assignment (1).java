package edu.nyu.objects;

public class Assignment {
	private int subject1;
	private int subject2;
	private int subject3;
	private String name;
	private String grade;
	private int total;
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotal() {
		return getSubject1()+getSubject2()+getSubject3();
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public String grade(){
	if(getTotal()>270 && getTotal()<=300){
		return "A";
	}
	else if(getTotal()>240 && getTotal()<=270){
		return "B";
	}
		else if(getTotal()>200 && getTotal()<=240){
			return "C";
		}
		else{
			return "F";
		}
		}
			
		}
	
	

	
	
	
