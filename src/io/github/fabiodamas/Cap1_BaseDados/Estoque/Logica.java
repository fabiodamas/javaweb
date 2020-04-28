package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
    String executa(HttpServletRequest req, HttpServletResponse res) 
            throws Exception;

}