package edu.nyu.objects;

public class EnumMain {
	public static void main(String[] args) {
for(EnumSample Sample:EnumSample.values()){
	System.out.println(Sample + " " +Sample.getDesc() +" " + Sample.getYear()+" "+Sample.getGrade());
}
	}

}
