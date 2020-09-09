package Classes;

public class Tarefas {
	private int id;
	public String status;
	public Usuario usuario;
	public String Titulo;
	public String descricao;
	
	public Tarefas(String status, Usuario usuario, String titulo, String descricao) {
		super();
		this.status = status;
		this.usuario = usuario;
		Titulo = titulo;
		this.descricao = descricao;
		this.id = this.id + 1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void show() {
		System.out.println("ID: " + this.getId());
		System.out.println("Status: " +this.getStatus());
		System.out.println("User: " +this.getUsuario());
		System.out.println("Titulo: " +this.getTitulo());
		System.out.println("Descricao: " +this.getDescricao());
		
	}
	
	
	
	

}
