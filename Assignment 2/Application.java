import java.util.*;  
 class Wiki{
	 double distance;
	 double count;
	 double time;
  public double timeCal(double distance)
  {
  this.distance=distance;
  if(distance<=5)
  {
	  time=time+1;
	  System.out.print("Wiki takes :"+time+ "s");  
  }
  else if(distance>5)
  {
	 while (distance>0){
          count=distance-5;
		  if(count<0)
		  {
			  time=time+1;
			  break;
		  }
		  else
		  {
			  time=time+1;
		  }
		  count=count-3;
		  if(count<0)
		  {
			  time=time+2;
			  break;
		  }
		  else
		  {
			  time=time+2;
		  }
		  count=count-1;
		  if(count<0)
		  {
			  time=time+3;
			  break;
		  }
		  else
		  {
			  time=time+3;
		  }
		  distance=count;
         }
  }
  else
  {
	System.out.println("You have to enter valid distance");  
  }
  return time;
  }
}

public class Application{
  
  public static void main(String[] args) {
	  Wiki obj1 = new Wiki();
	  
	  Scanner sc= new Scanner(System.in);
      System.out.print("Enter a the Distance(m): ");  
      double distance= sc.nextDouble();   
      double result=obj1.timeCal(distance);
	  System.out.print("Wiki takes :"+result+"s");  
        
  }
}