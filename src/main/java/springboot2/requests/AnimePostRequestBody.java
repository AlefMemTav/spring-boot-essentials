package springboot2.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimePostRequestBody {

    @NotEmpty(message = "The anime name cannot be empty")
    @Schema(description = "This is the Anime's name", example = "Tensei Shittara Slime Datta Ken", required = true)
    private String name;
}
