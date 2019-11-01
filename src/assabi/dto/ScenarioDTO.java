package assabi.dto;

import java.util.List;

import lombok.Data;

@Data
public final class ScenarioDTO {
	private Long id;
	private List<CriteriaTreeDTO> dimensions;
	
	@Data
	public static final class CriteriaTreeDTO {
		private Long id;
		private String name;
		private List<CriteriaDTO> criteria;
	}
	
	@Data
	public static final class CriteriaDTO {
		private Long id;
		private String name;
	}
}
