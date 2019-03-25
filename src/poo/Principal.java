package poo;

public class Principal
{
    public static void main(String[] args)
    {
        Batedeira arno = new Batedeira();
        Batedeira wallita = new Batedeira();

        arno.setPa("gancho");
        arno.setVelocidade(300);

        System.out.println(arno);
        System.out.println(wallita.toString());
    }
}
