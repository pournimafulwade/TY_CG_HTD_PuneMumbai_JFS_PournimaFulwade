package com.capgemini.Sorting.Demo;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}

	
	//Logic to Sort Students by ID Shortcut
	@Override
	public int compareTo(Student o) {
		Integer k = this.id;
		Integer m = o.id;
		return k.compareTo(m)*-1; //Without *-1 we will get result in Ascending
	}
	
	

	//Logic to Sort Students by Percentage Shortcut
	/*
	 * @Override 
	 * public int compareTo(Student o) { 
	 * Double k = this.percentage;  //because of Autoboxing we are able to directly call compareTo method 
	 * Double t = o.percentage; 
	 * return k.compareTo(t)*-1; //Without *-1 we will get result in Ascending
	 * }
	 */

	// Logic to Sort Students name in Descending Shortcut
	/*
	 * @Override public int compareTo(Student o) { return
	 * this.name.compareTo(o.name)*-1; }
	 */
	
	// Logic to Sort Students name in Ascending Shortcut
	/*
	 * @Override public int compareTo(Student o) { return
	 * this.name.compareTo(o.name); }
	 */
	
	
	//Logic to Sort Student by Name in Ascending
	/*
	 * @Override 
	 * public int compareTo(Student x) {
	 *  String k = this.name; 
	 *  String t = x.name;
	 *   int res = k.compareTo(t); 
	 *   return res;
	 * }
	 */
	
	
	//Logic to Sort Students by percentage
	/*
	 * @Override
	 *  public int compareTo(Student o) {
	 *   if(this.percentage > o.percentage) { 
	 * return 1; 
	 * } else if(this.percentage < o.percentage) { 
	 * return
	 * -1;
	 *  } else
	 *   return 0;
	 *    }
	 */
	
	//Logic to Sort Students by percentage Shortcut
	

	/* Logic to Sort Students by ID
	 * @Override 
	 * public int compareTo(Student s) { 
	 * if(this.id > s.id) { 
	 * return 1; }
	 * else if(this.id< s.id) {
	 *  return 1; }
	 *   else return 0; 
	 *   }
	 */	
	
	

}
