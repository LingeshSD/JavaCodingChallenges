package programs;

public class CharacterOccurance {

	public static void main(String[] args) {
		//How To Count Occurrences of a Character in a String
String value = "jaaava";

char character = 'a';

int count = 0;
for (int i = 0; i <value.length(); i++) {
	if(value.charAt(i)==character)
	{
		count++;
	}
	
}

System.out.print("The character "+character+" is occurred "+count+" times");
	

	}

}
