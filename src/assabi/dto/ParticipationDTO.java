package assabi.dto;

import java.util.Optional;

import lombok.Data;

@Data
public final class ParticipationDTO {
	private Long group;
	private InterpretationDTO interpretation;

	@Data
	public static final class InterpretationDTO {
		private Long id;
		private Long actor;
		private Long character;

		public Optional<Long> getId() {
			return Optional.ofNullable(id);
		}
	}
}
