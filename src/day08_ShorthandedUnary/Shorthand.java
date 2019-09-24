package day08_ShorthandedUnary;

public class Shorthand {
	/*
	 += : addition assignment ==> x+=y ==> x=x+y
	 -= : subtraction assignment ==> x-=y ==> x=x-y
	 *= : multiplication assignment ==> x*=y ==> x=x*y 
	  /= : division assignment:     x /= y   ==>   x = x/y
     %= :  Remainder assignment:  x %= y    ==> x= x%y;  
	  
	 */
	public static void main(String[] args) {
		
		int a=9;
		a+=3;//a= a+3;
		System.out.println(a);
		
		int b = a+=5;  //12+=5==>12+5=17
		System.out.println(b); 
		//a=17, b=17
		
		int c= a+=b; // 17+17=39
		System.out.println(c);
		//a=34, b=17, c=34
		
		int d= a+=c; // 34+34
		System.out.println(d);
		//a=68, d=68 , c=34, b=17
		
		int e = (d+=b)  * 2; //(68+17)*2=170
		System.out.println(e);
		// d=85, b=17, e=170
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		int f = b+=d *2; // b+=170 ==> b= 17+170 ==> b=187
		System.out.println(f); 
		
		int g =101;
		int h = g-=1;// 1001-1=100
		System.out.println(h);
		//h=100, h=100
		
		int i = g+=h+5; // 100+100+5=205
		System.out.println(i);
		// h=100, g=205  i=205
		
		int j = h+= g % i;  // h+= 205 % 205 ==>h+=0 ==> h=100
		System.out.println(j);
		// j=100 , h=100 
		
		int k = j-=h*2%5; // j-=100*2%5==> j-=0==> j=100
		System.out.println(k);
		//k=100, j=100
		
		int A = 100;
		A*=200;
		System.out.println(A);
		//A=20000
		
		int B=100;
			B*=100/10; // B=B*100/10 ==> B=100*100/10
		System.out.println("B "+B); 
		//B=1000
		
		B*=B-=1000; // B=1000*1000
		System.out.println(B);
		
		int C = 1000;
        C /= 5;
        System.out.println(C); // C=200
          
        int D =10;   
        C /=D+10;  // C /20  ==> 200/20 ==>10
        System.out.println("C "+C );  
        //  C /= D-10;   denominator can't be zero
      
      
		int E = 10;
		E%=2; // E=10%2
		System.out.println(E);
	
		int F =100;
		F%=2; // F=F%2 ==>0
		System.out.println(F);
		
		System.out.println(-100%3);
	    System.out.println( 10.5% 3 );  
	        //              10.5 /3 = 3     reminder:  10.5 - 3*3 = 1.5
	        
	        
	    int J = 300;
	    int K =10;
	    J += J %= K ;
	    System.out.println(J);  // 300
		
		
		
	}

}
