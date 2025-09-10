package ex01_object;
class HashCode{
	int value;
	HashCode(int value){
		this.value = value;
	}
	@Override
	public int hashCode() { //내용이 같으면 hash값을 같게 해줌.
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCode) {
			return ((HashCode)obj).value == value;
		} else return false;
	}
}
public class MainEx04_hashcode {
	public static void main(String[] args) {
		HashCode h1 = new HashCode(10);
		HashCode h2 = new HashCode(10);
		System.out.println("h1 == h2: " + (h1 == h2)); //false
		System.out.println("h1.equals(h2): " + (h1.equals(h2))); //false
		//내용이 같기때문에 true로 만들고 싶을 때 h1과 h2의 hashCode를 같게 만들어준다. => 오버라이딩으로 => true
		System.out.println("h1.hashCode(): " + h1.hashCode()); //989110044 //오버라이딩 후 10
		System.out.println("h2.hashCode(): " + h2.hashCode()); //424058530 //오버라이딩 후 10
		System.out.println("System.identityHashCode(h1): " + System.identityHashCode(h1)); //989110044=> 진짜 hashcode값=> 오버라이딩해도 변경되지 않는 값
		System.out.println("System.identityHashCode(h2): " + System.identityHashCode(h2)); //424058530
	}
}
