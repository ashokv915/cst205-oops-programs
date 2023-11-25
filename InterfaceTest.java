interface Callback
{
	void callbackfunction(int param);
}

class Client implements Callback 
{
	public void callbackfunction(int p)
	{
		System.out.println("Call back function with "+p);
	}
}

class AnotherClient implements Callback 
{
	public void callbackfunction(int p)
	{
		System.out.println("Another version "+(p*p));
	}
}

class Interfacetest
{
	public static void main(String args[])
	{
		Client c1=new Client();
		c1.callbackfunction(3);

		AnotherClient c2=new AnotherClient();
		c2.callbackfunction(3);
	}
}