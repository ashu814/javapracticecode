import java.io.IOException;  
class throwsEx
{  
  void m()throws IOException
  {  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p()
  {  
   try{  
    n();  
   }
   catch(Exception e)
   {
    System.out.println("exception handled");
  }  
  }  
  public static void main(String args[]){  
   throwsEx obj=new throwsEx();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}