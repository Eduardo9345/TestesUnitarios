package testeunitario.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ExemploServiceTest {

    @Test
    void testeSomarValorVerificarSeIgualENaoIgual(){

        //configurar
        ExemploService exemploService = new ExemploService();
        int resultadoEsperado = 6;

        //executar
        int resultadoReal = exemploService.somaValores(2, 4);

        // verificar (assert)
        Assertions.assertEquals(resultadoEsperado, resultadoReal, "2 + 4 deve ser 6");
    }

}
