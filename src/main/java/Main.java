public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("김철수", 20, "컴퓨터공학");
        Student s2 = new Student("김영희", 19, "수학");

        s1.introduce();
        s1.study();
        System.out.println();
        System.out.println("========================");
        System.out.println();
        s2.introduce();
        s2.study();
    }
}