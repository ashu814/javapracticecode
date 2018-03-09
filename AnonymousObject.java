class AnonymousObject{
	void j()
	{
		System.out.println("B");
	}
	public static void main(String[] args) {
	AnonymousObject b=new AnonymousObject()
	{
		void j()
		{
			System.out.println("Anonymous!");
		}
	};
	b.j();	
	}
}


