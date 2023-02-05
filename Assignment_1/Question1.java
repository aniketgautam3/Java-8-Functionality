package Assignment_1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args)
	{
		List<String> sent= Arrays.asList("Aniket", "Gautam", "MahatmaGandhi", "Roger", "Federer", "Tom" );
		sent.stream().filter(n->n.length()>=5&&n.length()<=8).forEach(n->System.out.println(n));
	}
}
