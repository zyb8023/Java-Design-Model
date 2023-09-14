public class ExceptionTest {

    public static void main(String[] args) {


        try {
            String a = null;
            a.indexOf('a');
            System.out.println("end");
        } catch (NullPointerException e) {
            System.out.println("抛出异常：" + e.getMessage());
        }

    }
}
