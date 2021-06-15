
package gui.vieira.mecurso.dto;

import gui.vieira.mecurso.entity.Curso;
import java.util.Date;
import org.springframework.data.domain.Page;

public class CursoDto {
    private int id;
    private String nome;
    private String descricao;
    private String ementa;
    private Date dataCadastro;
    private Date dataInicio;
    private float valor;

    public CursoDto(Curso curso) {
        this.nome= curso.getNome();
        this.descricao= curso.getDescricao();
        this.ementa= curso.getEmenta();
        this.dataCadastro= curso.getDataCadastro();
        this.dataInicio= curso.getDataInicio();
        this.valor= curso.getValor();
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
    
    public static Page<CursoDto> converter(Page<Curso> cursos){
        return cursos.map(CursoDto::new);
    }
    
    
    
}
