public class SpaceToLine {

    public static void main(String[] args) {
        System.out.println(reshape("Hello world"));
        String text = "\\n is used for a new line";
        System.out.println(text);
    }

    public static String reshape(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =  0; i < str.length(); i++){
            if (' ' == str.charAt(i)) {
                stringBuilder.append("\\n");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
