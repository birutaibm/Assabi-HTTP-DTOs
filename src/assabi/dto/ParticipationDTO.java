package assabi.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public final class ParticipationDTO {
	private Long group;
	private InterpretationDTO interpretation;

	@NoArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class InterpretationDTO {
		private Long id;
		private Long actor;
		private Long character;

		public InterpretationDTO(Long id) {
			super();
			this.id = id;
		}

		public InterpretationDTO(Long actor, Long character) {
			super();
			this.actor = actor;
			this.character = character;
		}
	}
}
