package intermediate;

public class ToggleCharacter {
    public static void main(String[] args) {
    String str= "Hello_World";
    StringBuilder toggle=new StringBuilder();


      for(int i=0;i<str.length();i++){
         char ch =str.charAt(i);
         if(Character.isUpperCase(ch)){
            toggle.append(Character.toLowerCase(ch));
         }
         else{
            toggle.append(Character.toUpperCase(ch));
         }
         }

         System.out.println(toggle.toString());

    }

    
}
