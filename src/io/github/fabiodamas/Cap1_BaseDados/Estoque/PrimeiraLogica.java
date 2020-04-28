package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {
        public String executa(HttpServletRequest req,
                HttpServletResponse res)
                throws Exception {
            System.out.println("Executando a logica e redirecionando...");
            return "primeira-logica.jsp";
        }
    }