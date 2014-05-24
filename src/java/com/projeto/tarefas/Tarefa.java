package java.com.projeto.tarefas;

import java.util.Date;

public class Tarefa implements Comparable<Tarefa> {
    private int idTarefa;
    private boolean concluido;
	private Date dataLimite;
    private String descTarefa;
    
    public int getIdTarefa() {
		return idTarefa;
	}
	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}
	public boolean isConcluido() {
		return concluido;
	}
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	public Date getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}
	public String getDescTarefa() {
		return descTarefa;
	}
	public void setDescTarefa(String descTarefa) {
		this.descTarefa = descTarefa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTarefa;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Tarefa)) {
			return false;
		}
		Tarefa other = (Tarefa) obj;
		if (idTarefa != other.idTarefa) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Tarefa o) {
		if (!this.equals(o)) {
			if (this.idTarefa > o.idTarefa) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}
	
	
}
