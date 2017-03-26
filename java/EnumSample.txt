package edu.nyu.objects;

public enum EnumSample{
	bucky ("very bad", "25","a"),
	vicky ("average","22","b"),
	dolly ("cute","21","c");
	
	private final String desc;
	private final String year;
	private final String grade;
	
EnumSample(String desc,String year,String grade){
	this.desc=desc;
	this.year=year;
	this.grade=grade;
	
}

public String getDesc() {
	return desc;
}

public String getGrade() {
	return grade;
}

public String getYear() {
	return year;
}

}
