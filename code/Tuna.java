package edu.nyu.objects;

public class Tuna {
private String girlname;


public Tuna(String girlname) {
	super();
	this.girlname = girlname;
}

public String getGirlname() {
	return girlname;
}

public void setGirlname(String girlname) {
	this.girlname = girlname;
}
public void saying(){
	System.out.println("your first gf was "+ getGirlname());
}

}
