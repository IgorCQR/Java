public class StringMethods {
    public static void main(String[] args){
        String name = "   Benvólio Montecchio   ";

        int lenght = name.length(); // lenght of string
        char letter = name.charAt(0); // find letter in index
        int index = name.indexOf("e"); // Index of letter (left for right)
        int Lastindex = name.lastIndexOf("e"); // (right for left)

        //name = name.trim(); Remove spaces for left and right
        //name = name.replace("o","u"); Exchange one letter for another

        //System.out.println(name.isEmpty()); Check the variable is empty (return Boolean)
    }
}