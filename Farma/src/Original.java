import javax.swing.JOptionPane;

public class Original extends Heranca{
	
	String alergico;
	String contraIndicacao;
	
	public String getAlergico() {
		return alergico;
	}
	public void setAlergico(String alergico) {
		this.alergico = alergico;
	}
	public String getContraIndicacao() {
		return contraIndicacao;
	}
	public void setContraIndicacao(String contraIndicacao) {
		this.contraIndicacao = contraIndicacao;
	}

	public void inputOri() {
		
		this.alergico = JOptionPane.showInputDialog("Alérgico a algum medicamento: ");
	    this.contraIndicacao = JOptionPane.showInputDialog("Contra indicação médica: ");
	  
	}

	public void showOri() {
        
		String mensagem = "Objeto Heranca.java";
     
        mensagem += "\nAlérgico a algum medicamento: " + this.alergico;
        mensagem += "\nContra indicação médica: " + this.contraIndicacao;

        
        JOptionPane.showMessageDialog(null, mensagem);
    }
	
	@Override
	public double TaxaServico(double taxaServ) {
		// TODO Auto-generated method stub
		return super.TaxaServico(taxaServ * 1.5);
	}
	
}
