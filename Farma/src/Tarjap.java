import javax.swing.JOptionPane;

public class Tarjap extends Heranca{
		
	String nomeMedico;
	String hospital;
	
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	public void inputTJP() {
	  
		this.hospital = JOptionPane.showInputDialog("Hospital: ");
	    this.nomeMedico = JOptionPane.showInputDialog("Nome do Médico: ");
	  
	}

	public void showTJP() {
        
		String mensagem = "Objeto Heranca.java";
     
        mensagem += "\nNome do Medico: " + this.nomeMedico;
        mensagem += "\nHospital: " + this.hospital;

        
        JOptionPane.showMessageDialog(null, mensagem);
    }
	@Override
	public double TaxaServico(double taxaServ) {
		// TODO Auto-generated method stub
		return super.TaxaServico(taxaServ * 3);
	}
	
	
}

