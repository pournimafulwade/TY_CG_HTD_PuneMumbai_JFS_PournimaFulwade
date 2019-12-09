package com.cabgemini.objectclass.methods;

public class Cow {
	 int id;
	 String name;
	 double height;
	 
	 public boolean equals(Object ref)
	 {
		 Cow r =(Cow)ref;
		 
		 if(this.id==r.id)
		 {
			 if(this.name==r.name)
			 {
				 if(this.height==r.height)
				 {
					 return true;
				 }
				 else
				 {
					 return false;
				 }
			 }
			 else
			 {
				 return false;
			 }
		 }
		 else
		 {
			 return false;
		 }
	 }
	 

}
