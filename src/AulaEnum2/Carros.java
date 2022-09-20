package AulaEnum2;

public enum Carros {
	
	SEDAN("1","Hb20","4 Portas","Alcool","Hyundai"),
	SUV("2","Allure","4 portas","Gasolina","Peuget"),
	HATCH("3","Argo","2 portas","Alcool", "Fiat"),
	CONVERSIVEL("4","Mini Cooper","4 portas","Gasolina","Mini");
	
	
		private String codCarro;
		private String nomeCarro;
		private String numeroPortas;
		private String combustivelCarro;
		private String marcaCarro;
		
			private Carros(String codCarro,String nomeCarro, String numeroPortas,String combustivelCarro,String marcaCarro) {
				this.codCarro = codCarro;
				this.nomeCarro = nomeCarro;
				this.numeroPortas = numeroPortas;
				this.combustivelCarro = combustivelCarro;
				this.marcaCarro = marcaCarro;
			}
			
				public String getCodCarro() {
					return codCarro;
				}
				
				public String getNomeCarro() {
					return nomeCarro;
				}
				
				public String getNumeroPortas() {
					return numeroPortas;
				}
				
				public String getCombustivelCarro() {
					return combustivelCarro;
				}
				
				public String getMarcaCarro() {
					return marcaCarro;
				}
			
	
}
