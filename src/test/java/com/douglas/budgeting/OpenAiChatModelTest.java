
package com.douglas.budgeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnabledIfEnvironmentVariable(
    named = "OPENAI_API_KEY",
    matches = ".+"
)
class OpenAiChatModelTest {

    @Autowired
    OpenAiChatModel chatModel;

    @Test
    void should_receiveResponse_when_chatModelIsCalled() {

        var response = chatModel.call(
            "Gere um registro de orçamento com descrição de gasto, " +
            "valor em reais e local. Responda em texto simples, " +
            "sem JSON ou formatação especial."
        );

        assertThat(response).isNotEmpty();

        System.out.println("\n==================================");
        System.out.println("   RESPOSTA DA INTELIGÊNCIA ARTIFICIAL");
        System.out.println("==================================\n");

        System.out.println(response);

        System.out.println("\n==================================");
    }
}
