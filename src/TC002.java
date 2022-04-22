public class TC002 {
    public static String codingBat(String str){
        /*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/
        String result ="";
        int end =0;
        for (int i = 0; i < str.length(); i+=4) {
            end = i+2;
            if(end > str.length())
                end= str.length();

            result += str.substring(i, end);
        }
        return result;
    }
}
