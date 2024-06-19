package trienkhaiarraylist;

public class TestMyLists {
    public static void main(String[] args) {
        MyLists<String> list = new MyLists<>();
        list.add("huy");
        list.add("shi");
        list.add("shin");
        String e = list.remove(1);
        System.out.println(e);
    }
}
