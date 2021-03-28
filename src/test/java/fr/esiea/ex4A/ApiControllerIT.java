package fr.esiea.ex4A;

import org.junit.jupiter.api.Test;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerIT {

    private final MockMvc mockMvc;

    ApiControllerIT(@Autowired MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void inscriptionTest() throws Exception {
        UserInfo user = new UserInfo("titi@gmail.com", "toto", "toto", "FR", "M", "F");

        Gson gson = new Gson();
        String json = gson.toJson(user);

        mockMvc
            .perform(MockMvcRequestBuilders.post("/api/inscription")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
            .andExpect(status().isOk());

    }

    private List<UserInfo> getMatchesTest() {
        List<UserInfo> users = new ArrayList<>();
        users.add(new UserInfo("toto@gmail.com", "toto", "toto", "FR", "M", "F"));
        return users;
    }
}
