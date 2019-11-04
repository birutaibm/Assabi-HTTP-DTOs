package assabi.dto;

import java.beans.ConstructorProperties;
import java.util.Collection;

import lombok.Data;

@Data
public class WeightCreationDTO {
	private final long group;
	private final int step;
	private final Collection<Component> components;

	@ConstructorProperties({"group", "step", "components"})
	public WeightCreationDTO(long group, int step, Collection<Component> components) {
		super();
		this.group = group;
		this.step = step;
		this.components = components;
	}

	@Data
	public static final class Component {
		private final long weightableId;
		private final String weightableType;
		private final double value;
		
		@ConstructorProperties({"weightableId", "weightableType", "value"})
		public Component(long weightableId, String weightableType, double value) {
			super();
			this.weightableId = weightableId;
			this.weightableType = weightableType;
			this.value = value;
		}
	}
}
