
public class NonVowel {
    public static void main(String[] args) {
        String name1="Pankaj Oberoi";
        String name=name1.toUpperCase();

        for(int i=0;i<name.length();i++){

            char ch=name.charAt(i);

            if(ch == 'A' || ch=='I' || ch=='O' || ch=='U'|| ch=='E'){
                System.out.print(ch+" ");
            }
        }
    }
}
