import java.util.regex.*;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co",
				"c.", "c0", "c#", "car", "combat", "count", "date", "disc", "spring.asdf1234123Dao"}; 
		
		String[] pattern = { "spring\\." }; /*"c[a-z]*", "c[a-z]", "c[a-zA-Z]",
				"c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\w", "c\\d", 
				"c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}" }; */
		
//		for(int x=0; x<pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[0]);
			System.out.print("Pattern : "+pattern[0]+" 결과: ");
			for(int i=0; i<data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches())
					System.out.print(data[i]+", ");
			}
			System.out.println();
//		}
//		System.out.println("spring\\..*Dao");
//		System.out.println("\\");
	} // main 
}
