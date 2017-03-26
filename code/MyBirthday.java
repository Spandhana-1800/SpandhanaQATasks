package edu.nyu.objects;

public class MyBirthday {
private String name;
private Calender birthday;
public MyBirthday(String name, Calender birthday) {
	super();
	this.name = name;
	this.birthday = birthday;

}
public void greeting(){
	//System.out.println(" month of birthday is " + birthday.getMonth() );
	System.out.println(name + " birthday is " + birthday );
}


}
