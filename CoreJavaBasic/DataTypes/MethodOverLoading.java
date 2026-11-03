package Com.globalQuest.CoreJavaBasic.DataTypes;

class Operations{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(float a,float b) {
		return a+b;
	}
	float add(float a,float b,float c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,double b,double c) {
		return a+b+c;
	}
	double add(float a,double b) {
		return a+b;
	}
	double add(double a,float b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
	double add(float a, double b, int c) {
		return a+b+c;
	}
	double add(double a,int b, float c) {
		return a+b+c;
	}

		public static void main(String[] args) {
		Operations op=new Operations();
		int a=11,b=12,c=13;
		float p=23.5f,q=33.5f,r=43.5f;
		double m=1234.5678,n=2345.6789,o=3456.7891;
		System.out.println(op.add(a, b,c));
		System.out.println(op.add(p,q,r));
		System.out.println(op.add(a,m,p));
		System.out.println(op.add(m,n,o));
		System.out.println(op.add(m,a,p));
		}
	}