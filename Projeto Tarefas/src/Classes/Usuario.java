package Classes;

public class Usuario {

		private int id;
		public String nome;
		public String email;
		public String cargo;
		
		
		public Usuario(String nome, String email, String cargo) {
			super();
			this.nome = nome;
			this.email = email;
			this.cargo = cargo;
			this.id = this.id + 1;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		
		public void show() {
			System.out.println("ID: " + this.getId());
			System.out.println("Nome: " +this.getNome());
			System.out.println("Email: " +this.getEmail());
			System.out.println("Cargo: " +this.getCargo());
			
		}
		
		public String toString() {
			return this.getNome();
			
		}
		
		
		
		
	 
}
