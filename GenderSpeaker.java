package lesson11;

public class GenderSpeaker {

	public static void main(String[] args) {
		//mainメソッドは以下の条件を満たします
		//Manクラス、Womanクラスのインスタンスを生成し、後述するdoSpeakメソッドに渡します

		//AbstractPerson man = new Man();

		doSpeak(new Man());
		doSpeak(new Woman());
	}

	private static void doSpeak(AbstractPerson person) {
		person.speak();
	}

}
