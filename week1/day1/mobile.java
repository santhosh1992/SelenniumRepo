package week1.day1;

public class mobile {
	
	public void sendSms() {
		 System.out.println("FROM OPPO");
	
	}
public long  makeCall( long phno)
{
	return phno;
}
public static  void main(String[] args)
{
	
	mobile obj=new mobile();
	obj.sendSms();
	System.out.println(obj.makeCall(0));
}
}
