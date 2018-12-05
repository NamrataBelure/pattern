package keywords;

public class Student {
         int id;
         String name;
         String city;
         Student(int id,String name){
        	 this.id=id;
        	 this.name=name;
         }
         public Student(int id,String name,String city){
		        this(id,name);
		        this.city=city;
		}
         void display()
         {
        	 System.out.println(id+" "+name+" "+city);
         }
	public static void main(String[] args) {
	    
            Student s1=new Student(1,"sonu");
            Student s2= new Student(2,"ranu","pune");
            s1.display();
            s2.display();
	}

}
