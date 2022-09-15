
public class ThreadPrintAverage 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Thread()
      {
    	  public void run()
    	  {
    		  int sum=0,avg=0;
    		  for(int i=0;i<50;i++)
    		  {
    			  sum=sum+i;
    			  avg=sum/50;
    		  }
    		  System.out.println("Sum of first fifty numbers is:"+avg);
    	  }
       }.start();
	
       new Thread()
       {
    	   public void run()
    	   {
    		   int array[]= {1,2,3,4,5,6,7,8};
    		   
    		   System.out.println("Square of array number{1,2,3,4,5,6,7,8}:");
    		   
    		   for (int i:array)
    		   {
    			   System.out.println(i*i+" ");
    		   }
    	   }
       }.start();
	
	}
}

