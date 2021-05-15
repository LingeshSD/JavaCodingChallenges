package programs;

public class StringInputConvert {
	public static void main(String[] args)
	{
//		String value = "JaVa";
//		char[] charArray = value.toCharArray();
//		String[] value2 = {"j","A","v","A"};
//		System.out.println(value.toUpperCase());
//		for(int i=0;i<=charArray.length;i++)
//		{
//			if(Character.isUpperCase(charArray[i]))
//			{
//				Character.toLowerCase(charArray[i]);
//			}
//			else
//			{
//				Character.toUpperCase(charArray[i]);
//			}
//		}
//		
//		System.out.println(charArray);
//	
		
		String str1="JaVa";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
	
		

}
