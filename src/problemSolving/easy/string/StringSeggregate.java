package problemSolving.easy.string;

public class StringSeggregate {
    public static void main(String[] args) {
        String seggregate = "Shu%18*05@9bha";
        String chars = "";
        String nums = "";
        String special = "";

        for (char ch : seggregate.toCharArray()){
            if (Character.isAlphabetic(ch)){
                chars += ch;
            } else if (Character.isDigit(ch)) {
                nums += ch;
            }else{
                special += ch;
            }
        }

        System.out.print("Characters : " + chars + ", " + "Numbers : " + nums + ", " + "Special : " + special);


    }
}

