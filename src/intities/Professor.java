package intities;

public class Professor {

	private String nomeProfessor;
	private String departamento;

	private int id;
	
	public Professor(String nomeProfessor, String departamento, int id) {
		super();
		this.nomeProfessor = nomeProfessor;
		this.departamento = departamento;
		
		this.id = id;
	}

	public Professor() {}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nProfessor: " + nomeProfessor + "\tDepartamento: " + departamento 
			  + "\nIdentificador: " + id;
	}	
}
