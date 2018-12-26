import javax.swing.JOptionPane;
class maior
{
    public static void main(String args[])
    {
        float num1, num2, mnum;

        num1 = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o primeiro valor"));

        num2 = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o segundo valor"));

        if(num1 > num2)
        {
            mnum = num1;
            JOptionPane.showMessageDialog(null,num1+" é maior que "+num2+"\nFico com: "+mnum);
            System.out.println(num1+" é maior que "+num2+"Fico com: "+mnum);
            System.out.println("Fico com: "+mnum);
        }
        else if(num1 == num2)
        {
            JOptionPane.showMessageDialog(null,num1+" é igual a "+num2);
            System.out.println(num1+" é igual a "+num2);
        }
        else
        {
            mnum = num2;
            JOptionPane.showMessageDialog(null,num2+" é maior que "+num1+"\nFico com: "+mnum);
            System.out.println(num2+" é maior que "+num1+"Fico com: "+mnum);
            System.out.println("Fico com: "+mnum);
        }

    }
}