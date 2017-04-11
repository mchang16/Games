import java.util.Scanner; 

public class FruitSalad {
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int size= Integer.parseInt(args[0]);
		Fruit [] FruitArray= new Fruit[size]; 
		System.out.println("1.) Add"); 
		System.out.println("2.) Remove"); 
		System.out.println("3.) Cut Ingredients"); 
		System.out.println("4.) Start Over"); 
		System.out.println("5.) Print Ingredients"); 
		System.out.println("6.) Finish"); 
		

		
		
	
		
	int choice = 0; 
	 do{
		 
			System.out.print("Choice:");
			 choice = input.nextInt();
			
		 switch (choice){
		 case 1: add(FruitArray,input);break;
		 case 2: remove(FruitArray,input);break;
		 case 3: cut(FruitArray);break;
		 case 4:restart(FruitArray);break;
		 case 5:display(FruitArray);break;
		 case 6:break;

		 }

	 }
	 while(choice != 6);
		
		
	}
	public static void add(Fruit[] a, Scanner s){
		int Continue= a.length; 
		String KnowWeight=""; 
		do{
		System.out.println("Do you know the weight? (\"yes\"/\"no\"):");
		KnowWeight = s.next(); 
		}while (!KnowWeight.equals("yes") && !KnowWeight.equals("no"));
		if (KnowWeight.equalsIgnoreCase("yes")){
			System.out.println("What is the weight of the fruit?");
			int weight=s.nextInt(); 
			System.out.println("What is the name of the fruit:");
			String name=s.next(); 
			System.out.println("What is the color of the fruit:");
			String color=s.next(); 
			System.out.println("Is the fruit cut:");
			boolean cut=s.nextBoolean();
			Fruit NewFruit =new  Fruit(name, color, weight,cut ); 
			for(int i=0;i<Continue;i++ ){
				if (a[i]==null){
					a[i]= NewFruit; 
				}
			}
		}
		else if (KnowWeight.equalsIgnoreCase("no")){
		System.out.println("What is the name of the fruit");
		String name=s.next(); 
		System.out.println("What is the color of the fruit:");
		String color=s.next(); 
		Fruit NewFruit =new  Fruit(name, color); 
		for(int i=0;i<Continue;i++ ){
			if (a[i]==null){
				a[i]= NewFruit; 
			}
		}
		}
		
		 
			
	}
	
	public static void remove(Fruit[] f, Scanner s){
		
		System.out.println("Which fruit would you like to remove:");
		String removeFruit = s.next();
		for(int i = 0; i < f.length; i++){
			if (f[i]!=null){
				String compareName=f[i].getName(); 
			if( compareName== removeFruit){
				f[i]=null; 
				i=f.length; 
			}
			}
			else System.out.println("Could not remove fruit");
			
		}
		
	}
	
	
	public static void cut(Fruit[] f){
		
		for(int i = 0; i < f.length; i++){
			if(f[i] != null){
				f[i].setCut(true);
				
			}
		}
		
		
	}
	public static void restart(Fruit[] f){
		for(int i = 0; i < f.length; i++){
			f[i]=null; 
		}

	}
	public static void display(Fruit[] f){
		for (int Index=0; Index<f.length; Index++){
		if (f[Index]!=null){
					System.out.println("Weight: "+f[Index].getWeight());
				
					System.out.println("Name: " +f[Index].getName());
				
					System.out.println("Color: " +f[Index].getColor());
				
					System.out.println("Cut: "+f[Index].isCut());
		}
		}
	}
}