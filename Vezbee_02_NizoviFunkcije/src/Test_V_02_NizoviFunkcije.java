
public class Test_V_02_NizoviFunkcije 
{
	public static int sumaNizaV1(int h[])
	{
		int s = 0;
		for (int i : h) 
			s+= h[i];
		return s;
	}

	public static int sumaNiza(int d[])
	{
		int sum = 0;
		for(int c = 0; c < d.length; c++)
			sum += d[c];
		return sum;
	}
	
	public static int brojClanovaNiza(int d[])
	{
		int br = 0;
		for (int g : d)
			br++;
		return br;
	}
	
	public static double srednjaVrednostNiza(int d[])
	{
		double srev = 0;
		int brojac = 0;
		int zbir = 0;
		for (int i = 0; i < d.length; i++) 
		{
			zbir += d[i];
			brojac++;
			
		}
		srev = zbir*1.0 / brojac;
		return srev;
	}

	public static void main(String[] args) 
	{
		int a [] = new int [5];
		a[0] = 2;
		a[1] = 5;
		a[2] = 10;
		a[3] = 54;
		a[4] = 3;
		
		System.out.print(" prvi nacina sa for  a : ");
		for (int i = 0; i < 5; i++)
		{
			System.out.print(a[i] + " ");			
		}
		System.out.println();
		System.out.print("drugi nacina foreach a : ");
		int s = 0;
		int b = 0;
		double sr = 0;
		
		for (int i : a) 
		{
			s+= i;
			b++;
		}
		sr = s*1.0 / b;
		System.out.println(s + " " + b);
		System.out.println("srednja vrednost niza : " + sr);
		System.out.println();
		System.out.println("Suma niza");
/*		int sum = 0;
		for(int c = 0; c < a.length; c++)
			sum += a[c];
		System.out.println("Suma niza je : " + sum);*/
		sumaNiza(a);
		System.out.println("suma niza je : " + sumaNiza(a));
		
		System.out.println();
		System.out.println("Broj clanova niza ");
		int br = 0;
		for (int i : a)	
			br++;
		System.out.println("Broj clanova niza je : " + br);
		
		brojClanovaNiza(a);
		System.out.println("broj clanova niza preko funkcija je " + br);
		System.out.println();
		System.out.println(" srednja vrednost niza p1");
		double srv = 0;
		srv = sumaNiza(a)*1.0 / brojClanovaNiza(a);
		System.out.println(" P1 srednja vrednost niza : " + srv);
		System.out.println();
		System.out.println(" srednja vrednost niza p2");
		double srev = 0;
		int brojac = 0;
		int zbir = 0;
		for (int i = 0; i < a.length; i++) 
		{
			zbir += a[i];
			brojac++;
			
		}
		
		srev = zbir*1.0 / brojac;
		System.out.println(" P2 srednja vrednost niza : " + srev);
		System.out.println();
		System.out.println(" srednja vrednost niza p3");
//		srednjaVrednostNiza(a);
		System.out.println(" P3 srednja vrednost niza : " + srednjaVrednostNiza(a));
//		System.out.println("Suma niza a je : " + sumaNizaV1(a));
		System.out.println();

	}

}
