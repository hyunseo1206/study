import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.awt.Color;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Color> favoriteFruits = new HashMap<String, Color>();
		favoriteFruits.put("Apple ", Color.RED);
		favoriteFruits.put("Orange", Color.YELLOW);
		favoriteFruits.put("Melon ", Color.GREEN);
		
		Set<String> keySet = favoriteFruits.keySet();
		for (String key : keySet) {
			Color v = favoriteFruits.get(key);
			System.out.println(key + " : " + v);
		}
	}
}
