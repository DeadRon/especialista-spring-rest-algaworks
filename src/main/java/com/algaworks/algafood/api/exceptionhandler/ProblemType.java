package com.algaworks.algafood.api.exceptionhandler;

public enum ProblemType {

    ENTIDADE_NAO_ENCONTRADA("/entidade-nao-encontrada", "Entidade não encontrada"),
    ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
    ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
    MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem incompreensível"),

    PROPRIEDADE_IGNORADA("/propriedade-ignorada", "Propriedade ignorada"),

    PROPRIEDADE_DESCONHECIDA("/propriedade-desconhecida", "Propriedade desconhecida");

    private String title;
    private String uri;

    ProblemType (String path, String title){
        this.uri = "https://algafood.com.br/" + path;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getUri() {
        return uri;
    }
}
