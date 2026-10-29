package com.andriele.notificacao.infrastructure.exceptions;

public class EmailException extends RuntimeException{

    public EmailException(String mensagem){
        super(mensagem);
    }

    public EmailException(String mennsagem, Throwable throwable){
        super(mennsagem, throwable);
    }
}
