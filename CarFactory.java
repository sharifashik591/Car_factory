
public class CarFactory extends Car implements ICarTryOut {
	
	public CarFactory(String type) {
		this.type=type;
	}
	
	
	//Method Overloading 
	public void carMacker() {
		if (this.type.toUpperCase().equals("A")) {
			int i=0;
			this.A[i]="A110";
			i++;
			System.out.println("Your New Car was Create.Model Number is " + this.A[0]);
			
			
		}else if(this.type.toUpperCase().equals("B")) {
			int j=0;
			this.B[j]="B13";
			j++;
		
			System.out.println("Your New Car was Create.Model Number is " + this.B[0] );
			
		}else if(this.type.toUpperCase().equals("C")) {
			int k=0;
			this.C[k]="C112";
			k++;
			
			System.out.println("Your New Car was Create.Model Number is " + this.C[0]);
			
		}else {
			System.out.println("We are made three type of car Like A , B and C.Please Correct Model");
			System.out.println(this.type.toUpperCase());
		}
		
	}
	

	public void started(String model) {
		System.out.println(model +" was started");
		
	}
	public void driven(String model) {
		System.out.println(model +" was driven");
		
	}
	public void stoped(String model) {
		System.out.println(model +" was stoped");
		
	}

	
	
}
