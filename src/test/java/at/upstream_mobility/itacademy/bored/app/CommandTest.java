package at.upstream_mobility.itacademy.bored.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class CommandTest {

    @InjectMocks
    private Command command;
    @Mock
    private Client client;

    @DisplayName("get mock activity with no filters")
    @Test
    void get_noFilters() {
        //given
        when(client.request(null, null, null, null)).thenReturn(getResponse());

        //when
        String result = command.get(null, null, null, null);

        //then
        Assertions.assertTrue(result.contains("Volunteer at your local food pantry"));
        Assertions.assertTrue(result.contains("charity"));
        Assertions.assertTrue(result.contains("1"));
        Assertions.assertTrue(result.contains("0.5"));
        Assertions.assertTrue(result.contains("0.1"));
    }

    @DisplayName("get mock activity with all filters")
    @Test
    void get_allFilters() {
        //given
        String type = "charity";
        Integer participants = 1;
        Double price = 0.5;
        Double accessibility = 0.1;

        when(client.request(type, participants, price, accessibility)).thenReturn(getResponse());

        //when
        String result = command.get(type, participants, price, accessibility);

        //then
        Assertions.assertTrue(result.contains("Volunteer at your local food pantry"));
        Assertions.assertTrue(result.contains("charity"));
        Assertions.assertTrue(result.contains("1"));
        Assertions.assertTrue(result.contains("0.5"));
        Assertions.assertTrue(result.contains("0.1"));

    }

    private Response getResponse() {
        return new Response("Volunteer at your local food pantry", "charity", 1, 0.5, "", "1878070", 0.1);
    }
}