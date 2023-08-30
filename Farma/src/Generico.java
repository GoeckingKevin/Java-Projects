import javax.swing.JOptionPane;

public class Generico extends Heranca{
	
	int duracao; 
	int miligramas; 
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getMiligramas() {
		return miligramas;
	}
	public void setMiligramas(int miligramas) {
		this.miligramas = miligramas;
	}

	public void inputGen() {
		
		this.duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração do tratamento (em dias): "));
	    this.miligramas = Integer.parseInt(JOptionPane.showInputDialog("Miligramas: "));
	  
	}

	public void showGen() {
        
		String mensagem = "Objeto Heranca.java";
     
        mensagem += "\nDuração do tratamento (em dias): " + this.duracao;
        mensagem += "\nMiligramas: " + this.miligramas;

        
        JOptionPane.showMessageDialog(null, mensagem);
    }
	@Override
	public double TaxaServico(double taxaServ) {
		// TODO Auto-generated method stub
		return super.TaxaServico(taxaServ * 0.5);
	}
	
	
}
