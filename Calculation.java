class Calculation
{
	void fact(int n){
	int fac=1;
	for(int i=1;i<=n;i++){
	fac=fac*i;}
	System.out.println("fac "+fac);}
	public static void main(String arg[]){
	new Calculation().fact(6);}
}