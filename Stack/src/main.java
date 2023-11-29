
public class main {
public static void main(String []args) {
	Stack<Integer> s=new Stack(6);
	
	s.push(10);
	s.push(10);
	s.push(20);
	s.push(20);
	s.push(30);
	s.push(30);
	s.push(40);
	s.display();
	s.pop();
	s.display();
	
	s.pop();
	s.pop();
	s.pop();
	s.pop();
}
}
