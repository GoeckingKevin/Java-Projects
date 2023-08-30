import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Heranca {
	
	private String nome;            
	private double preco;
	private int idade;

	
	public String getNome() {       
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void inputInfo() {
	    this.nome = JOptionPane.showInputDialog("Nome do paciente: ");  
	    this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do paciente: ")); 
	}

	public void ShowInfo() {  
        String mensagem = "Objeto Heranca.java";  

        
        mensagem += "\nNome do paciente: " + this.nome;
        mensagem += "\nIdade do paciente: " + this.idade;

        NumberFormat formatar = DecimalFormat.getCurrencyInstance();

        mensagem += "\nPreço: " + formatar.format(this.preco);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
	
	public double TaxaServico (double taxaServ) {          
	    this.preco += this.preco * taxaServ /100;		   
	    return this.preco;
	}

}

