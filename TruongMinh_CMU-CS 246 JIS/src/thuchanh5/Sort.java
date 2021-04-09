package thuchanh5;

public class Sort {
		 public void swap(int a,int b) {
				 int temp =a;
				 a=b;
				 b=temp;
		 }
		 public void ascSort(int a,int b,int c){
			 if(a > b) swap(a,b);
			 if(a > c) swap(a,c);
			 if(b > c) swap(b,c);
			 
			 System.out.println("sapxep :"+" "+a);
			 
		 }
		


	public static void main(String[] args) {
		Sort s=new Sort();
		s.ascSort(5, 4, 3);
		
	}

}
