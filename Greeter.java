public class Greeter{
	public static void main(String[]args){
		String name;
		if (args.lenth>0){
			name=args[0];
		} else name="Earthling"
		System.out.println("Hi, "+name);
	}
}