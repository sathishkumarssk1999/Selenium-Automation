package interview;

class function {
    public void music() {
        System.out.println("music");
    }

    public void music(int a) {
        System.out.println(a);
    }
}

public class functionOverLoading {
    public static void main(String[] args) {
        function test = new function();
        int n = 5;
        test.music(n);
        test.music();
    }

}
