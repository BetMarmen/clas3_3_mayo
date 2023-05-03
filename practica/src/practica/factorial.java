package practica;

public class factorial {
	int num;

	public factorial() {
	}

	public factorial(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public static int factor(int n) 
	{
		int factor = 1;
		
		
		for(int i =1 ;i<=n;i++)
		{
			factor*=i;
		}
		
		return factor;
		
	}

}
