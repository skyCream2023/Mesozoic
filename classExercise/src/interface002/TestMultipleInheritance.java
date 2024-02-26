package interface002;

interface A{default void foo() {System.out.println("A:foo");}}
interface B{default void foo() {System.out.println("B.foo\n");}}
	
public class TestMultipleInheritance implements A,B{
	@Override
	public void foo() {
		System.out.println("testMultipleinheritance::foo");
		A.super.foo();
//			Afoo();
		B.super.foo();}
	
	public static void main(String[] args) {
//		A.super.foo();
		new TestMultipleInheritance().foo();
	}
}


