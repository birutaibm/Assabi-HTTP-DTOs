package assabi.dto;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public class ExistingApplicationDTO {
	private Long id;
	private String name;
	private ScenarioDTO scenario;
	private List<Phase> phases;

	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class Phase {
		private Long id;
		private String name;
		private int steps;
		private List<Group> groups;
	}

	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class Group {
		private Long id;
		private String name;
		private List<CharacterDTO> characters; // Character do assabi-back
	}
}
