class BoxOne
{
	private double width;
	private double height;
	private double depth;

	BoxOne(BoxOne ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}

	BoxOne(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}

	BoxOne()
	{
		width=-1;
		height=-1;
		depth=-1;
	}

	BoxOne(double len)
	{
		height=width=depth=len;
	}

	double volume()
	{
		return width*height*depth;
	}
}

class BoxWeight extends BoxOne
{
	double weight;

	BoxWeight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
}

class DemoBoxWeight
{
	public static void main(String args[])
	{
		BoxWeight b1=new BoxWeight(10,20,15,34.3);
		BoxWeight b2=new BoxWeight(2,3,4,0.076);

		double vol;

		vol=b1.volume();
		System.out.println("Volume of Box b1 is "+vol);
		System.out.println("Weigth of Box b1 is "+b1.weight);

		vol=b2.volume();
		System.out.println("Volume of Box b2 is "+vol);
		System.out.println("Weigth of Box b2 is "+b2.weight);


	}
}