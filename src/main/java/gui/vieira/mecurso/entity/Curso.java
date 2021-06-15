
package gui.vieira.mecurso.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private float id;
    
    private String nome;
    private String descricao;
    private String ementa;
    private Date dataCadastro;
    private Date dataInicio;
    private float valor;
    
    public Curso(String nome, String descricao, String ementa, Date dataCadastro, Date dataInicio, float valor) {
		this.setNome(nome);
		this.setDescricao(descricao);
                this.setEmenta(ementa);
                this.setDataCadastro(dataCadastro);
                this.setDataInicio(dataInicio);
                this.setValor(valor);
	}

    
    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

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

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", ementa=" + ementa + ", dataCadastro=" + dataCadastro + ", dataInicio=" + dataInicio + ", valor=" + valor + '}';
    }
    
    
    
    
}
