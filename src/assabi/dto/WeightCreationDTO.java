package assabi.dto;

import java.util.Collection;

import lombok.Data;

@Data
public class WeightCreationDTO {
	private final long group;
	private final int step;
	private final Collection<Component> components;

	@Data
	public static final class Component {
		private final long weightableId;
		private final String weightableType;
		private final double value;
	}
}
