/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 2
 * Section:  M  
 * Student Name:Ahmad Baig  
 * Student eecs account: ahmad85
 * Student ID number: 215180870
 **********************************************************/
package assignment2;

import java.util.Arrays;
import java.util.Stack;
		

public class Expression {
	
	
	static Stack<String> s1 = new Stack<>();
	static Stack<Character> s2 = new Stack<>();
	static StringBuilder b = null;
	
	public static void main(String[] args) {
		/*System.out.println("EXPRESSION: a + 20 )/ b - c )* 53.4 - d )))");
		System.out.println(Expression.FPIE("a + 20 )/ b - c )* 53.4 - d )))"));
		System.out.println(Expression.UPPE("a + 20 )/ b - c )* 53.4 - d )))"));
		
	 
		System.out.println("EXPRESSION: l + 2 )/ w - q )* 5 - f )))");
		System.out.println(Expression.FPIE("l + 2 )/ w - q )* 5 - f )))"));
		System.out.println(Expression.UPPE("l + 2 )/ w - q )* 5 - f )))"));
		 */
		/*	
		System.out.println("EXPRESSION: w + x )* q + r ))");
		System.out.println(Expression.FPIE(" w + x )* q + r ))"));
		System.out.println(Expression.UPPE(" w + x )* q + r ))"));
		
	
		*/
		
		
		  
	}
	

 

	public static String FPIE(String expression) {
		
		String r1 = "";
		

		for (int i = 0; i < expression.length(); i++) {
			char c1 = expression.charAt(i);

			if (c1==')') {
				if (b != null) {
					s1.push(b.insert(0, '(').append(')').toString());
					b = null;
				} else if (s1.size() >= 2) {
					String b = s1.pop();
					String a = s1.pop();
					s1.push('(' + a + b + ')');
				}
			} else if ((c1 == '+' || c1 == '-' || c1 == '*' || c1== '/') && b == null && !s1.isEmpty())
				s1.push(s1.pop() + c1);
			else {
				if (b == null)
					b = new StringBuilder();
				b = b.append(c1);
			}
		}

		r1 = String.join("", s1);
		return "FPIE  " + r1 ; 
		
	}	
		public static String UPPE(String expression) {
		
		
		
		String r2 = "";
		
		
		for (int i = 0; i < expression.length() - 1; i++) {
			char c2 = expression.charAt(i);

			if (!(c2 == '+' || c2 == '-' || c2 == '*' || c2 == '/') && (c2!=')'))
				r2 += c2;

			else if ((c2 == '+' || c2 == '-' || c2 == '*' || c2== '/'))
				s2.push(c2);

			else if (c2==')') {
				if (!s2.isEmpty())
					r2 += s2.pop();

			}
		}

		while (!s2.isEmpty())
			r2 += s2.pop();

		
		return  "UPPE  " + r2;
		}



}
