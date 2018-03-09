class Inheritance
{
	float salary=3000;
}
class Faculty extends Inheritance
{
	float bonous=2000;
	public static void main(String[] args)
	 {
		Faculty obj=new Faculty();
		System.out.println("Salary is" +obj.salary);
		System.out.println("salary is" + obj.bonous);
	}
}



