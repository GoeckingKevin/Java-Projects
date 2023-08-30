
public class Principal {

	public static void main(String[] args) {        
				                                   
		Heranca geral = new Heranca();
        
		geral.inputInfo();         
        geral.setPreco(100);       
        geral.TaxaServico(10);
        
        
        Tarjap black = new Tarjap(); 
                                     
        black.inputTJP();
        black.setPreco(100);
        black.TaxaServico(10);
        
        Tarjav red = new Tarjav(); 
        red.inputRed();
        red.setPreco(100);
        red.TaxaServico(10);
        
        Generico gen = new Generico(); 
        gen.inputGen();
        gen.setPreco(100);
        gen.TaxaServico(10);
        
        Original ori = new Original(); 
        ori.inputOri();
        ori.setPreco(100);
        ori.TaxaServico(10);
       
        
        System.out.println("Nome do paciente: " + geral.getNome()); 
        System.out.println("Idade do paciente: " + geral.getIdade());
        System.out.println("Hospital: " + black.getHospital());
        System.out.println("Nome do médico: " + black.getNomeMedico());             
        System.out.println("Medicamento: " + red.getMedicamento());
        System.out.println("Convênio: " + red.getConvenio());
        System.out.println("Duração do tratamento (em dias): " + gen.getDuracao());
        System.out.println("Miligramas: " + gen.getMiligramas()+"Mg");
        System.out.println("Alérgico a algum medicamento: " + ori.getAlergico());
        System.out.println("Contra indicação médica: " + ori.getContraIndicacao());
        
        System.out.println("\nTabela de preços: ");
        System.out.println("\nPreço sem taxa (Retirar na loja): R$" + geral.getPreco());
        System.out.println("\nEntrega a domicílio: ");
        System.out.println("Preço Tarja preta: R$" + black.getPreco());
        System.out.println("Preço Tarja vermelha: R$" + red.getPreco());
        System.out.println("Preço Genérico: R$" + gen.getPreco());
        System.out.println("Preço Original: R$"+ ori.getPreco());
        
        
	}

}
