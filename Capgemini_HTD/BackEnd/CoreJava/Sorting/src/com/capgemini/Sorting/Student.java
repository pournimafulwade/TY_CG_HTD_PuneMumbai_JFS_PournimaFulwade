package com.capgemini.sorting;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percent;
	public Student(int id, String name, double percent) {
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	@Override
	public int compareTo(Student s) {
		Double a =this.percent;
		Double b=s.percent;
		
		return a.compareTo(b);
	}
	
	
	
	
	//logic to sort students by id
	/*@Override
	public int compareTo(Student s) {
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
		{
			return -1;
		}
		else
		return 0;
	}
	
	//logic to sort students by percentage 
	@Override
	public int compareTo(Student s) {
		if(this.percent>s.percent)
		{
			return 1;
		}
		else if(this.percent<s.percent)
		{
			return -1;
		}
		else
		return 0;
	}

	
	@Override
	public int compareTo(Student s) {
		String a =this.name;
		String b =s.name;
		int res = a.compareTo(b);
		return res;
	}
	//logic to sort students by name ascending order
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
	//logic to sort students by name descending  order
		@Override
		public int compareTo(Student s) {
			return this.name.compareTo(s.name) * -1;
		}*/
}
