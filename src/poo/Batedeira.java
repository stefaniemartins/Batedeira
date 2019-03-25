package poo;

public class Batedeira
{
    // Atributos
    private int velocidade; // 0 (desligada) até 5 (máxima).
    private int pote; // 1 - pequeno, 2 - médio e 3 - grande.
    private String pa;

    // Métodos
    public String toString()
    {
        return "Batedeira velocidade = " + velocidade + ",pote = " + pote + ", pá = " + pa;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public void setVelocidade(int velocidade)
    {
        if ((velocidade >= 0) && (velocidade <= 5))
        {
            this.velocidade = velocidade;
        }
    }

    public int getPote()
    {
        return pote;
    }

    public void setPote(int pote)
    {
        this.pote = pote;
    }

    public String getPa()
    {
        return pa;
    }

    public void setPa(String pa)
    {
        this.pa = pa;
    }
}
