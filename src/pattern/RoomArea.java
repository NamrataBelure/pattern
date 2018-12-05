package pattern;

 class Room
	{
	     float l;
	     float b;
	     void getdata(float a,float c)
	     {
	    	 l=a;
	    	 b=c;
	     }
    }
class RoomArea
	{
		public static void main(String []args)
		{
			float area;
			Room room1=new Room();
			room1.getdata(10,14);
			area=room1.l*room1.b;
			System.out.println("Area="+area);
		}
	}


