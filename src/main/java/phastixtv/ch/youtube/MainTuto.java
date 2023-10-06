package phastixtv.ch.youtube;

public class MainTuto {

    private static String name = "2c34168c-608c-4680-b5af-077b51c02005";
    private static int age = 100;

    public static void main(String[] args) throws ClassNotFoundException {
        MySQLTuto.connect();
        MySQLTuto.update("INSERT INTO `user`(`Name`, `Age`) VALUES ('" + name + "','" + age + "')");
        MySQLTuto.disconnect();
    }
}
