package assabi.dto;

import java.util.Collection;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public class WeightCreationDTO {
	private long group;
	private int step;
	private Collection<Component> components;

	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter(AccessLevel.PRIVATE)
	public static final class Component {
		private long weightableId;
		private String weightableType;
		private double value;
	}
}
