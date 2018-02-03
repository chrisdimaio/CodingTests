import java.util.HashMap;
import java.util.Map;

public class ReconstructString {
	public static void main(String[] args) {
		String str = "The quick fox jumped over the slow cat who also jumped a cat.";

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		String[] strArray = str.split(" ");

		for(int i = 0; i < strArray.length; i++){
			String word = strArray[i];
			map.put(i, word);
		}

		System.out.println(map);

		String newString = "";
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			newString += entry.getValue() +  " ";
		}

		System.out.println(newString);
	}
}