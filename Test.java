package innerClass;

import innerClass.OuterClass.InnerClass1;

public class OuterTest {
public static void main(String[] args) {
	OuterClass outer  = new OuterClass();
	outer.method();
	OuterClass.InnerClass inner = new OuterClass().new InnerClass();	
}
}
