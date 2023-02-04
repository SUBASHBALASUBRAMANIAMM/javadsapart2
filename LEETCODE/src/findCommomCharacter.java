import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findCommomCharacter {

        public static void main(String[] args) {
            String[] words = {"cool", "lock", "cook"};
            String[] first = null;
            first = words[0].split("");
            //System.out.println(Arrays.toString(first));
//        char[] first = words[0].toCharArray();
            int count = 0;
            ArrayList al = new ArrayList<>();
            for (int i = 1; i < words.length; i++) {
                String[] second = null;
                second = words[i].split("");
                al = new ArrayList<>();
                for (int j = 0; j < second.length; j++) {
                    al.add(second[j]);
                }
                System.out.println(al);
                for (int k = 0; k < first.length; k++) {
                    if (al.contains(first[k])) {
                        int temp = al.indexOf(first[k]);
                        al.remove(temp);


                    } else {
                        first[k] = "0";
                    }

                }
            }
            System.out.println(Arrays.toString(first));
//        for(int i=0;i<first.length;i++){
//            if(first[i] >=97 && first[i] <=122) count++;
//        }
            List<String> res = new ArrayList<>();
            int z = 0;
            for (int i = 0; i < first.length; i++) {
                if (first[i] != "0") {
                    res.add(first[i]);
                }

            }
            System.out.println(res);


        }
    }


