package testeunitario.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Em geral, os testes não precisam de ordem, porém existem situações em que ordenar o projeto é util
/*
 * MethodOrderer.DisplayName

    MethodOrderer.MethodName

    MethodOrderer.Random

    MethodOrderer.OrderAnnotation
        @Order: quanto menor o número, maior a prioridade (números negativos são permitidos)
 */
public class ExemploServiceTest {

    @Test
    @DisplayName("Testae somar valor e verificar se são ou não iguais")
    @Order(-1)
    //assert Equals
    void testeSomarValorVerificarSeIgualENaoIgual(){

        // //configurar
        // ExemploService exemploService = new ExemploService();
        // int resultadoEsperado = 6;

        // //executar
        // int resultadoReal = exemploService.somaValores(2, 4);

        // // verificar (assert)
        // Assertions.assertEquals(resultadoEsperado, resultadoReal, "2 + 4 deve ser 6");

        ExemploService exemploService = new ExemploService();

        assertEquals(6, exemploService.somaValores(2, 4), "2 + 4 deve ser igual a 6");
    }

    //assert Null
    @Test
    @Order(-2)
    void testeVerificarSeObjetoNulo(){
        ExemploService exemploService = new ExemploService();
        assertNull(exemploService.verificarNulo(null), "objeto deve ser nulo");
        assertNotNull(exemploService.verificarNulo("string"), "objeto não deve ser nulo");
    }

    // assert true ou false
    @Test
    @Order(0)
    void testeVerificarSeValorMaiorQue(){
        ExemploService exemploService = new ExemploService();
        assertTrue(exemploService.verificarSeMaiorQue(10, 5), "valor 1 deve ser maior que valor 2");
        assertFalse(exemploService.verificarSeMaiorQue(5, 50), "valor 1 deve ser menor que valor 2");
    }

    //assert para arrays
    @Test
    void testeVerificarSeArraySaoIguais(){
        System.out.println("Metodo: testeVerificarSeArraySaoIguais");
        ExemploService exemploService = new ExemploService();
        String[] expectedArray = {"A", "B", "C", "D"};

        assertArrayEquals(expectedArray, exemploService.retornarQuatroPrimeirasLetrasAlfabeto());
    }

    // assert iterable
    @Test
    void testeVerificarSeArrayListsSaoIguais(){
        System.out.println("Método: testeVerificarSeArrayListsSaoIguais");

        ExemploService exemploService = new ExemploService();
        ArrayList <String> expectedArray = new ArrayList <String> ();
        
        expectedArray.add("A");
        expectedArray.add("B");
        expectedArray.add("C");
        expectedArray.add("D");
        expectedArray.add("E");

        assertIterableEquals(expectedArray, exemploService.retornarCincoPrimeirasLetrasAlfabeto());

    }
}
