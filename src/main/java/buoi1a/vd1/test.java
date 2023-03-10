package buoi1a.vd1;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        // tao tu dien anh viet
        MyDictionary<String,String> myDictionary = new MyDictionary<>();
        myDictionary.setK("hello");
        myDictionary.setV("xin chao");
        System.out.println(myDictionary);
        // 1 tu tieng anh ung voi nhieu tu tieng viet
        MyDictionary<String, List<String>> myDictionary1 = new MyDictionary<>();
        myDictionary1.setK("hi");
        myDictionary1.setV(Arrays.asList("xin chào", "chào", "lời chào"));
        System.out.println(myDictionary1);
    }
}
