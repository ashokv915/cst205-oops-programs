class Box
{
	double height;
	double width;
	double depth;
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = mybox1;
		double vol;

		mybox1.height = 10;
		mybox1.width = 20;
		mybox1.depth = 30;

		mybox2.height = 5;
		mybox2.width = 5;
		mybox2.depth = 5;

		vol = mybox1.height * mybox1.width * mybox1.depth;

		System.out.println(vol);
	}
}