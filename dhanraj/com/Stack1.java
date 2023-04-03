package dhanraj.com;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack st=new Stack();
		st.push("Dhanraj");
		st.push(true);
		st.push(44.9f);
		st.push(88.00d);
		st.push(2);	
		st.pop();
		st.pop();
		st.pop();
//		 st.pop();
		
		
		
		System.out.println(st);
	}

}
