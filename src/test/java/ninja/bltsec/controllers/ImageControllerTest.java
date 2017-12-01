package ninja.bltsec.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class ImageControllerTest {

    ImageService imageService;
    ImageController imageController;
    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        imageController = new ImageController(imageService);
        mockMvc = MockMvcBuilders.standaloneSetup(imageController).build();
    }

    @Test
    public void handleImagePost() throws Exception {
        MockMultipartFile multipartFile =
                new MockMultipartFile("file", "testing.txt", "text/plain",
                        "BLTSEC Ninja".getBytes());

        this.mockMvc.perform(multipart("/recipe/1/image").file(multipartFile))
                .andExpect(status().isFound())
                .andExpect(header().string("Location", "/"));
    }
}
