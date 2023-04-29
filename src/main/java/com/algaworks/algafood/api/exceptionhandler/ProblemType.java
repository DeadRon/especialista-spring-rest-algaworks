package com.algaworks.algafood.api.exceptionhandler;

public enum ProblemType {

    ENTIDADE_NAO_ENCONTRADA("/entidade-nao-encontrada", "Entidade não encontrada"),
    RECURSO_NAO_ENCOTRADO("/recurso-na-encontrado", "Recurso não encontrado"),
    ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
    MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem incompreensível"),
    PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro errado"),
    ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema"),
    ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso");
    private String title;
    private String uri;

    ProblemType (String path, String title){
        this.uri = "https://algafood.com.br" + path;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getUri() {
        return uri;
    }
}
