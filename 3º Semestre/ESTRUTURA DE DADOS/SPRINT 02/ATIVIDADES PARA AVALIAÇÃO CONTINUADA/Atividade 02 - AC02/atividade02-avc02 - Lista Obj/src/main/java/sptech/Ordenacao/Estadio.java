package sptech.Ordenacao;

public class Estadio {
//Crie um pacote chamado ordenacao no projeto
//Adicione nesse pacote sua classe de tema livre feita na Atividade 02 - Avaliação Continuada 01,
// caso tenha criado outras classes para ordenação e teste, também adicione neste projeto

    private Integer id;
    private String nome;
    private Double lotacao;
    private String tipoCobertura;
    private String tipoEvento;
    private Double valorDoEstadio;

    public Estadio(Integer id, String nome, Double lotacao, String tipoCobertura, String tipoEvento, Double valorDoEstadio) {
        this.id = id;
        this.nome = nome;
        this.lotacao = lotacao;
        this.tipoCobertura = tipoCobertura;
        this.tipoEvento = tipoEvento;
        this.valorDoEstadio = valorDoEstadio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLotacao() {
        return lotacao;
    }

    public void setLotacao(Double lotacao) {
        this.lotacao = lotacao;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Double getValorDoEstadio() {
        return valorDoEstadio;
    }

    public void setValorDoEstadio(Double valorDoEstadio) {
        this.valorDoEstadio = valorDoEstadio;
    }




}

