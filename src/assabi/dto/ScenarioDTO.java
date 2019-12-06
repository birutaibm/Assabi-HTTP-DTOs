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
public final class ScenarioDTO {
	private Long id;
	private List<CriteriaTreeDTO> dimensions;
	
	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class CriteriaTreeDTO {
		private Long id;
		private String name;
		private List<CriteriaDTO> criteria;
	}
	
	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class CriteriaDTO {
		private Long id;
		private String name;
	}
}
