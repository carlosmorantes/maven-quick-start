package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public Application() {
        System.out.println ("Inside Application");
    }

    public void sayHi() {
    	List<String> greetings = new ArrayList<String>();
    	greetings.add("Hello!");

    	for(String s : greetings) {
    		System.out.println(s);
    	}
    }

    public int countWords(String words)
    {
    	String[] separateWords = StringUtils.split("words", ' ');
    	return (separateWords == null) ? 0 : separateWords.length;
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
    	Application app = new Application();
    	app.sayHi();
    	String s = " lo 233";
    	System.out.println(">>s:"+s);
    	System.out.println(">>s.trim:"+s.trim());
    	System.out.println(">>s.trim.equals:"+s.trim().equals(""));
    }
}