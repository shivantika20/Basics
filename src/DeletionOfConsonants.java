public class DeletionOfConsonants {
    public static void main(String[] args)
    {
        String input = "Hello, have a good day";
        for(int i =0; i < input.length();i++)
        {
            if(input.charAt(i)!='a'||input.charAt(i)!='e' || input.charAt(i)!='o')
            {
                input = input.replace(Character.toString(input.charAt(i)), "");
            }
        }
        System.out.println(input);
    }
}
