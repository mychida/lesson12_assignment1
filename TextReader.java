package lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	public enum Mark { //列挙型
		START, END
	};

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new ObjectList<>(); //総称型ジェネリクス オートボクシング

		try (FileReader fr  = new FileReader;
			 BufferedReader br = new BufferedReader;) {  //??try with resource文 close処理が必要なファイル
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String value : valueList) { //拡張for文
			System.out.println(value);
		}
	}

	public static void main(String... args) { //可変長引数
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}

}
