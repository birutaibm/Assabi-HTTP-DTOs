package assabi.dto;

import java.util.ArrayList;
import java.util.Collection;

import lombok.Data;

@Data
public class DistanceOptionDTO {
	private final String name;
	private final String description;
	private final double value;
	private final Collection<DistanceDimensionDTO> dimensions = new ArrayList<>();
	
	@Data
	public static final class DistanceDimensionDTO {
		private final String name;
		private final double value;
		private final Collection<DistanceCriterionDTO> criteria = new ArrayList<>();
		
		public void addCriteria(DistanceCriterionDTO criterion) {
			criteria.add(criterion);
		}
	}
	
	@Data
	public static final class DistanceCriterionDTO {
		private final String name;
		private final String description;
		private final double value;
	}

	public void addDimensions(DistanceDimensionDTO dimension) {
		dimensions.add(dimension);
	}
}