package assabi.dto;

import java.util.Optional;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public final class ParticipationDTO {
	private Long group;
	private InterpretationDTO interpretation;

	public ParticipationDTO(Long group, InterpretationDTO interpretation) {
		super();
		this.group = group;
		this.interpretation = interpretation;
	}

	@NoArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class InterpretationDTO {
		private Long id;
		private Long actor;
		private Long character;

		public Optional<Long> getId() {
			return Optional.ofNullable(id);
		}

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
