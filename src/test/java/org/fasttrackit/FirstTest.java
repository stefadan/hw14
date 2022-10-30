package org.fasttrackit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each");
    }

    @Test
    @DisplayName("WHEN numbers are positive")
    public void sumTest() {

    //GIVEN
    int a = 2;
    int b = 3;
    First f = new First();
    //WHEN
    int result = f.sum(a, b);
    //THEN
    Assertions.assertThat(result).isEqualTo(5);

    }

    @Test
    @DisplayName("WHEN numbers are negative")
    public void sumNegativeTest(){
        //GIVEN
        int a = -3;
        int b = -1;
        //WHEN
        First f = new First();
        int result = f.sum(a, b);
        //THEN
        Assertions.assertThat(result).isEqualTo(-4);
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }


}
