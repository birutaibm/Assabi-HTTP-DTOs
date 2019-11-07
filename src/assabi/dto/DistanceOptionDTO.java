package assabi.dto;

import java.util.ArrayList;
import java.util.Collection;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public class DistanceOptionDTO {
	private String name;
	private String description;
	private double value;
	private Collection<DistanceDimensionDTO> dimensions = new ArrayList<>();
	
	public DistanceOptionDTO(String name, String description, double value) {
		super();
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public void addDimensions(DistanceDimensionDTO dimension) {
		dimensions.add(dimension);
	}

	@NoArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class DistanceDimensionDTO {
		private String name;
		private double value;
		private Collection<DistanceCriterionDTO> criteria = new ArrayList<>();

		public DistanceDimensionDTO(String name, double value) {
			super();
			this.name = name;
			this.value = value;
		}
		
		public void addCriteria(DistanceCriterionDTO criterion) {
			criteria.add(criterion);
		}
	}
	
	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class DistanceCriterionDTO {
		private String name;
		private String description;
		private double value;
	}
}