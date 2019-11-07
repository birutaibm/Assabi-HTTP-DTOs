package assabi.dto;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public class ApplicationDTO {
	private String name;
	private long admin;
	private long scenario;
	private Map<String, Integer> phases;
}
