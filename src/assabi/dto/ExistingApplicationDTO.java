package assabi.dto;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @RequiredArgsConstructor @ToString
public class ExistingApplicationDTO {
	private Long id;
	private String name;
	private ScenarioDTO scenario;
	private List<Group> groups;
	@Getter @Setter @RequiredArgsConstructor @ToString
	private class Group {
		private Long id;
		private String name;
		private List<CharacterDTO> characters; // Character do assabi-back
	}
}
