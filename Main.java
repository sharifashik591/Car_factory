import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int status;
		String typeA="";
		String typeB="";
		String typeC="";
		String tryOut;
		String type="",color;
		String eType;
		boolean selfDriving;
		
		System.out.println("Do You want to a new car?");
		System.out.println("Press 1 for Yes");
		System.out.println("Press 2 for No");
		status=scan.nextInt();
		if(status==1) {
		System.out.println("Which Type? There are Three Type Like A , B and C");
		
		type=scan.next();
		System.out.println("		Car Macker		\n");
		
		System.out.println("Which color Type?");
		color=scan.next();
		System.out.println("Which Engine Type?");
		eType=scan.next();
		System.out.println("Is Self Driving ?");
		try {
			selfDriving=scan.nextBoolean();
			
		}catch(NumberFormatException ex) {
			System.out.println("Input type Exception");
		}
		
		CarFactory cf=new CarFactory(type);
		cf.carMacker();
		}else if(status==2) {
			CarFactory cf=new CarFactory(type);
			System.out.println("Total Create Car are:");
			System.out.println("Type A:" + cf.A.length);
			System.out.println("Type B:" + cf.B.length);
			System.out.println("Type C:" + cf.C.length);
			
			System.out.println("The available car are:");
			// For Type A Car
			for(int a=0;a<cf.A.length;a++) {
				
				typeA=typeA.concat(cf.A[a]).concat(" ");
			
			}
			System.out.println("Type A:" + typeA);
		
			// For Type B Car
			
             for(int b=0;b<cf.B.length;b++) {
				
				typeB=typeB.concat(cf.B[b]).concat(" ");
			
			}
			System.out.println("Type B:" + typeB);
		

			// For Type C Car
			
             for(int c=0;c<cf.C.length;c++) {
				
				typeC=typeC.concat(cf.C[c]).concat(" ");
			
			}
			System.out.println("Type C:" + typeC);
		
			
			
			
			try {
				System.out.println("Enter the Model Number of the car You want to try out");
				//CarFactory cf=new CarFactory(type);
				tryOut=scan.next();
				//For Car Start
				System.out.println("Start Car? 1 for Yes 2 for No");
				int start=scan.nextInt();
				if(start==1) {
					cf.started(tryOut);
					
					//For Car Driven
					System.out.println("Drive Car? 1 for Yes 2 for No");
					int driven=scan.nextInt();
					if(driven==1) {
						cf.driven(tryOut);
					}else {
						System.out.println("No Driven");
					}
					
					//For Car Stop
					System.out.println("Stop Car? 1 for Yes 2 for No");
					int stop=scan.nextInt();
					if(stop==1) {
						cf.stoped(tryOut);
					}else {
						System.out.println("No Stop");
					}
					
				}else {
					System.out.println("No start");
				}
				
				
				
				
			}catch(NullPointerException ex) {
				System.out.println("this is an Exception");
			}
			

			
		}else {
			System.out.println("Provide Correct Information");
		}
		
		
				
		

		


		
		

	}

}
