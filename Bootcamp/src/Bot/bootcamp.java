package Bot;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class bootcamp{
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devInscritos = new HashSet<>();
	private Set<conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getataInicial() {
		return dataInicial;
	}
	
	public LocalDate getdataFinal() {
		return dataFinal;
	}
	
	public Set<Dev> getdevInscritos(){
		return devInscritos;
	}
	
	public void setdevInscritos(Set<Dev> devInscritos) {
		this.devInscritos = devInscritos;
	}
	
	public Set<conteudo> getconteudos(){
		return conteudos;
	}
	
	public void setconteudos(Set<conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	
	public boolean equals (Objects o) {
		if (this == 0) return true;
		if (o == null || getClass() != o.getClass()) return false; 
		bootcamp bootcamp = (bootcamp) o;
		return Objects.equals(nome, bootcamp.nome) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects .equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
	}
	
	public int hashCode() {
		return Objects.hash(nome, descricao, dataInicial, dataFinal, devInscritos, conteudos);
	}
	
	
	
}

