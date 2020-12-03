public class StringManipulator {
    //Trim and Concatenate method
    public String trimAndConcat(String stringA, String stringB) {
        String newStringA = stringA.trim();
        String newStringB = stringB.trim();
        String concatString = newStringA.concat(newStringB);
        return concatString;
    }

    //Index of String (Single Char)
    public Integer getIndexOrNull(String string, char character) {
        Integer index = string.indexOf(character);
        if (index == -1){
            return null;
        } else {
            return index;
        }
    }

    //Index of String (Substring)
    public Integer getIndexOrNull(String string, String substring) {
        Integer index = string.indexOf(substring);
        if (index == -1){
            return null;
        } else {
            return index;
        }
    }

    // Get Substring and Concatenate
    public String concatSubstring(String mainString, int startIndex, int endIndex, String secondSubstring) {
        return ((mainString.substring(startIndex, endIndex)).concat(secondSubstring));
    }
}
