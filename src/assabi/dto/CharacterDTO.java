package assabi.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public final class CharacterDTO {
	private Long id;
	private String name;
	private String description;
}
