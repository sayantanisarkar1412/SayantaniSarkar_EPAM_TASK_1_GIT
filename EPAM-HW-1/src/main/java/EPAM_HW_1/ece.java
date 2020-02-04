package EPAM_HW_1;

interface gift
{double getw();

void setw(double w);
double getp();
void setp(double p);

}


class sweets implements gift
{
double wt;
double prc;
public void setw(double f)
{
 wt=f;
}   
public double getw()
{
 return wt;
}
public void setp(double p)
{
 prc=p;
}   
public double getp()
{
 return prc;
}
  
}

class cho extends sweets
{

public void display()
{
 System.out.println("Weight: "+ this.getw());
 System.out.println("Price: "+this.getp()); 
}

}

class ece
{

public static void main(String args[])
{
   cho obj=new cho();
  double wi=8.5;
  double pp=7.5;  //scan;
   obj.setw(wi);
   obj.setp(pp);
   obj.display();




}



}
