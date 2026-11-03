package Com.globalQuest.CoreJavaBasic.DataTypes;

public class WrapperExample {

	public static void main(String[] args) {
		byte bt = 126;
		System.out.println("The Primitive Representation ="+bt);
		Byte byt=new Byte(bt);
		System.out.println("The Non-Primitive Representation="+byt);
		System.out.println("---------------");
		short st = 12345;
		System.out.println("The Primitive Representation ="+st);
		Short srt=new Short(st);
		System.out.println("The Non-Primitive Representation="+srt);
		System.out.println("---------------");
		int  i = 123456;
		System.out.println("The Primitive Representation ="+i);
		Integer it=new Integer(i);
		System.out.println("The Non-Primitive Representation="+it);
		System.out.println("---------------");
		long l = 1234567l;
		System.out.println("The Primitive Representation ="+l);
		Long lng=new Long(l);
		System.out.println("The Non-Primitive Representation="+lng);
		System.out.println("---------------");
		float ft = 12345678.432f;
		System.out.println("The Primitive Representation ="+ft);
		Float flt=new Float(ft);
		System.out.println("The Non-Primitive Representation="+flt);
		System.out.println("---------------");
		double db = 12345.6789;
		System.out.println("The Primitive Representation ="+db);
		Double  dbl=new Double(db);
		System.out.println("The Non-Primitive Representation="+dbl);
		System.out.println("---------------");
		char c= 'p';
		System.out.println("The Primitive Representation ="+c);
		Character cr=new Character(c);
		System.out.println("The Non-Primitive Representation="+cr);
		System.out.println("---------------");
		boolean b= true;
		System.out.println("The Primitive Representation ="+b);
		Boolean bl=new Boolean(b);
		System.out.println("The Non-Primitive Representation="+bl);
		System.out.println("---------------");
	}

}
