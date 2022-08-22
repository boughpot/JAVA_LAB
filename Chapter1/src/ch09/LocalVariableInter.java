package ch09;

public class LocalVariableInter {
	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
		//str = 3;
		//스크립트 언어에서는 사용가능하지만, 문자열에 숫자를 넣을수 없다.
		
	}
}
