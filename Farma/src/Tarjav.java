import javax.swing.JOptionPane;

public class Tarjav extends Heranca{
	
	String medicamento;
	String convenio;
	
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	public void inputRed() {
		  
		this.medicamento = JOptionPane.showInputDialog("Medicamento: ");
	    this.convenio = JOptionPane.showInputDialog("Convênio: ");
	  
	}

	public void showRed() {
        
		String mensagem = "Objeto Heranca.java";
     
        mensagem += "\nMedicamento: " + this.medicamento;
        mensagem += "\nConvênio: " + this.convenio;
    
        JOptionPane.showMessageDialog(null, mensagem);
    }
	@Override
	public double TaxaServico(double taxaServ) {
		// TODO Auto-generated method stub
		return super.TaxaServico(taxaServ * 2);
	}
	
}
